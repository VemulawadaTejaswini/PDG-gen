

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);

		long res=1;
		long wari=1000000007;


		int kaisu=sc.nextInt();


		for(int i=1; i<=kaisu; i++) {
			res*=i;
			res=res%wari;
		}
		System.out.println(res);
	}
}