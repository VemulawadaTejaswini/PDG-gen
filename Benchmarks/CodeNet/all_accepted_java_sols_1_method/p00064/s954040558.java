

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		
		while (sc.hasNext()) {
			String s = sc.next();
			char n[] = s.toCharArray();
			int a=0;
			int cnt = 1;
			

			for (int i = n.length-1; i >=0; i--) {
				if (n[i] == '1' || n[i] == '0' || n[i] == '2' || n[i] == '3'
						|| n[i] == '4' || n[i] == '5' || n[i] == '6'
						|| n[i] == '7' || n[i] == '8' || n[i] == '9') {
					a = a + (int)(n[i]-'0') * cnt;
					cnt = cnt * 10;
				} else {
					sum = sum + a;
					cnt = 1;
					a = 0;
				}
				
			}
			sum = sum + a;

		}
		System.out.println(sum);
	}

}