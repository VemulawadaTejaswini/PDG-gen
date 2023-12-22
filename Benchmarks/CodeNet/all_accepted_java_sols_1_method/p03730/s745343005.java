

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();

		for(int i=1; i<10000; i++) {
			if(A*i%B==C) {
				System.out.println("YES");
				System.exit(0);
			}
		}

		System.out.println("NO");
	}
}