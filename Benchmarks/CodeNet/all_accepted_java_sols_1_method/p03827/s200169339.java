

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int max=0;
		int nagasa=sc.nextInt();
		int point=0;
		String a=sc.next();

		for(int i=0; i<nagasa; i++) {
			if(a.charAt(i)=='D') {
				point--;
			}
			else if(a.charAt(i)=='I') {
				point++;
				if(point>max) {
					max=point;
				}
			}
		}
		System.out.println(max);
	}
}