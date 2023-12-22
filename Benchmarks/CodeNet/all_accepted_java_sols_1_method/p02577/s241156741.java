import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int n = 0;
		for(char c : str){
			n = (n + Integer.parseInt("" + c))%9;
		}
		
		System.out.println((n == 0) ? "Yes" : "No");
	}
}
