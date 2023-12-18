import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<List<Integer>> list = new ArrayList<List<Integer>>(50);
		
		int prevComCount = 0;
		boolean decreasing = false;
		
		//first
		list.add(new ArrayList<Integer>());
		list.get(0).add(Integer.valueOf(br.readLine()));
		
		
		while(true) {
			String str = br.readLine();
			
			if(!decreasing) {
				int comCount = 0;
				for(int i = str.indexOf(","); i != -1; i = str.indexOf(",", i+1)) {
					comCount++;
				}
				decreasing = prevComCount > comCount;
				prevComCount = comCount;
			}
			
			int commaPos = str.indexOf(",");
			
			if(commaPos == -1) { //last
				list.get(list.size()-1).add(Integer.valueOf(str));
				break;
			}
			else {
				int prev = 0;
				int i = 0;
				int cursor = commaPos;
				for(; cursor != -1; cursor = str.indexOf(",", cursor+1), i++) {
					if(!decreasing && i == 0) {
						list.add(new ArrayList<Integer>());
					}
					list.get(list.size() - 1 - i).add(Integer.valueOf(str.substring(prev, cursor)));
					prev = cursor + 1;
				}
				list.get(list.size() - 1 - i).add(Integer.valueOf(str.substring(prev)));
			}
			
		}
		
		int width = list.size();
		int[][] weight = new int[width][width];
		
		for(int y = 0; y < width; y++) {
			for(int x = 0; x < width; x++) {
				int left = (x == 0 ? 0 : weight[y][x-1]);
				int up   = (y == 0 ? 0 : weight[y-1][x]);
				weight[y][x] = list.get(y).get(x) + Math.max(left, up);
			}
		}
		
		System.out.println(weight[width-1][width-1]);
	}
}