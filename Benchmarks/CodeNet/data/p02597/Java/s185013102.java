//package abc174;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int ptr1 = 0;
		int ptr2 = str.length()-1;
		
		long ans = 0;
		
		while(ptr1 < ptr2) {
			if(str.charAt(ptr1) == 'W' && str.charAt(ptr2) == 'W') {
				ptr2--;
			}else if(str.charAt(ptr1) == 'R' && str.charAt(ptr2) == 'R') {
				ptr1++;
			}else if(str.charAt(ptr1) == 'W' && str.charAt(ptr2) == 'R') {
				ans++;
				ptr1++;
				ptr2--;
			}else {
				ptr1++;
				ptr2--;
			}
		}
		
		System.out.println(ans);
	}	

}
