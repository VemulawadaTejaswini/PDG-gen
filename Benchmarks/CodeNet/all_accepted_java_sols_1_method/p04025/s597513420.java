import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[] d = new int[n];
		int ave = 0;
		for(int i = 0 ; i < n ; i++){
			d[i] = Integer.parseInt(strs[i]);
			ave += d[i];
		}
		ave = Math.round((float)ave/n);
		int score = 0;
		for(int i = 0 ;i < d.length ; i++){
			score += (ave-d[i])*(ave-d[i]);
		}
		
		System.out.println(score);
		
		return;
	}
}
