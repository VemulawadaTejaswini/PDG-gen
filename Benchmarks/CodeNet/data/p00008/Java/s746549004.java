import java.io.*;
import java.util.ArrayList;
public class Main {
	
	public static int sum = 0;
	
	public static int calc (int target) {
		
		for (int i = 0; i < 10; i++)
		for (int j = 0; j < 10; j++)
		for (int k = 0; k < 10; k++)
		for (int l = 0; l < 10; l++) {
			if (i + j + k + l == target) sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			int n = Integer.parseInt(s);
			ans.add(calc(n));
			sum = 0;
			
		}
		
		for (int a : ans) {
			System.out.println(a);
		}
		
	}

}