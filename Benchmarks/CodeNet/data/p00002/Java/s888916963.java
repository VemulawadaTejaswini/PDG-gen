

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int a=sc.nextInt(),b=sc.nextInt();
			int s=a+b;
			int d=s!=0?0:1;
			while(s>0){
				d++;
				s/=10;
			}
			ln(d);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}