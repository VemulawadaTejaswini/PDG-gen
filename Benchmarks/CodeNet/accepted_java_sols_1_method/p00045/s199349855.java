import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		int sum = 0;
		double ave = 0;
		int cnt = 0;
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			cnt++;
			
			StringTokenizer st = new StringTokenizer(s,",");
			int price = Integer.parseInt(st.nextToken());
			int quantity = Integer.parseInt(st.nextToken());
			
			ave += quantity;
			sum += quantity * price;
			
		}
		
		ave /= cnt;
		
		System.out.printf("%d\n%.0f\n",sum, ave);
		
//		for (int a : ans) {
//			System.out.println(a);
//		}
	}
	
}