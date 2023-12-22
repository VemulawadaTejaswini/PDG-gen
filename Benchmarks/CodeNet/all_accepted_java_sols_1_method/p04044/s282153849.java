

import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		int mjs=sc.nextInt();
		String[] aa=new String[kosu];

		for(int i=0; i<kosu; i++) {
			aa[i]=sc.next();
		}
		Arrays.sort(aa);
		String src="";
		for(int i=0; i<kosu; i++) {
			src=src+aa[i];
		}
		System.out.println(src);
	}
}