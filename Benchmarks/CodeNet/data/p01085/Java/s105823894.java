import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// ??????????????????????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count =0;
			int m = 0, nMin = 0, nMax = 0;
			HashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
			
			while(true){
				if(count == 0) {
					String[] temp = br.readLine().split(" ",-1);
					m = Integer.parseInt(temp[0]);
					nMin = Integer.parseInt(temp[1]);
					nMax = Integer.parseInt(temp[2]);
					count++;
					continue;
				} else {
					map.put(count, Integer.parseInt(br.readLine()));
					count++;
				}
				if (m == count){
					count = 0;
					ArrayList<Integer> margins = new ArrayList<>();
					for(int j = nMax; j > nMax - nMin + 1; j--){
						margins.add(map.get(1)-map.get(nMax - j));
					}
					System.out.println(margins.stream().max((a,b) -> a.compareTo(b)).get());
				} else {
					count++;
					continue;
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}