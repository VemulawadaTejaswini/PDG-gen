

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int a=sca.nextInt();
		int b=sca.nextInt();
		int y=sca.nextInt();
		int x=sca.nextInt();
		int v=a*b-y*b-(a-y)*x;
		System.out.print(v);
	}

}
