import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		
		int n = Integer.parseInt(strs[0]);
		int x = Integer.parseInt(strs[1]);
		int t = Integer.parseInt(strs[2]);
		
		System.out.println((int)(Math.ceil((double)n/x)*t) );
		
	}
}
