import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
//		
//		ArrayList<String> ans = new ArrayList<String>();
//		
//		int n = Integer.parseInt(br.readLine());
//		for (int i = 0; i < n; i++) {
//			BigInteger a = new BigInteger(br.readLine());
//			BigInteger b = new BigInteger(br.readLine());
//			if (a.toString().length() > 80 || b.toString().length() > 80 || a.add(b).toString().length() > 80) {
//				ans.add("overflow");
//				continue;
//			}
//			ans.add(a.add(b).toString());
//		}
//		
//		for (String a : ans)
//			System.out.println(a);
		int a = Integer.parseInt(br.readLine());
		long sum = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		System.out.println(sum);
		
	}
	
}