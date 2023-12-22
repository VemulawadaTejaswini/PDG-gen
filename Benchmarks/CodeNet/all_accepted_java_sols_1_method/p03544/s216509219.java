

import java.util.Scanner;

class Main{
	public static void main(String[] main) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		long[] Ryca=new long[87];

		Ryca[0]=2;
		Ryca[1]=1;

		for(int i=2; i<87; i++) {
			Ryca[i]=Ryca[i-1]+Ryca[i-2];
		}

		System.out.println(Ryca[a]);
	}
}