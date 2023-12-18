

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();

		String a="";

		for(int i=0; i<W+2; i++) {
			a=a+"#";
		}
		System.out.println(a);

		for(int i=0; i<H; i++) {
			a="";
			a="#"+sc.next()+"#";
			System.out.println(a);
		}

		a="";

		for(int i=0; i<W+2; i++) {
			a=a+"#";
		}
		System.out.println(a);
	}
}