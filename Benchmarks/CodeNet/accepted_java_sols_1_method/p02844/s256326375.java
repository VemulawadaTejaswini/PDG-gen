


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		boolean[] one = new boolean[10];
		boolean[] two = new boolean[100];
		boolean[] three = new boolean[1000];
		for (int i=0;i<n;i++) {
			int digit = s.charAt(i)-'0';
			for (int j=0;j<100;j++) {
				if (two[j]) {
					three[j*10+digit]=true;
				}
			}
			for (int j=0;j<10;j++) {
				if (one[j]) {
					two[j*10+digit]=true;
				}
			}
			one[digit]=true;
		}
		
		int ans = 0;
		for (int i=0;i<1000;i++) {
			
			if (three[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	
	}
}



