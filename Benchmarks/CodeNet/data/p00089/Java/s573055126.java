import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	static int[][] diamond = null;
	static int[] max = null;
	static int[] tmpMax = null;
	static int height = -1;
	static int width = -1;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		width = array.size() / 2 + 1;
		height = array.size();
		diamond = new int[height][width];
		max = new int[width];
		
		for(int i = 0; i < height; i++) {
			String s = array.get(i);
			String[] data = s.split(",");
			for(int j = 0; j < data.length; j++) {
				diamond[i][j] = Integer.parseInt(data[j]);
			}
		}
		dfs(1,0,0,0);
		tmpMax = max.clone();
		dfs(-1,0,0,0);
		Arrays.sort(max);
		System.out.println(max[max.length - 1]);
	}
	private static void dfs(int plus, int index, int sum, int count) {
		if(count >= (width - 1)) {
			if(plus == 1) {
				max[index] = Math.max(sum + diamond[count][index], max[index]);
			} else {
				max[index] = Math.max(sum + tmpMax[index], max[index]);
			}
			return;
		}
		if(plus == 1) {
			dfs(plus, index, sum + diamond[count][index], count + 1);
			dfs(plus, index + 1, sum + diamond[count][index], count + 1);
		} else {
			dfs(plus, index, sum + diamond[height - count - 1][index], count + 1);
			dfs(plus, index + 1, sum + diamond[height - count - 1][index], count + 1);
		}
	}
}