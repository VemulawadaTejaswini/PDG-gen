

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long Q=sc.nextLong();
		long H=sc.nextLong();
		long S=sc.nextLong();
		long D=sc.nextLong();
		
		long[] ichi_li=new long[3];
		long[] ni_li=new long[4];
		
		ichi_li[0]=Q*4;
		ichi_li[1]=H*2;
		ichi_li[2]=S;
		long ichi_saiyasu=Math.min(Math.min(ichi_li[0], ichi_li[1]), ichi_li[2]);
		
		ni_li[0]=Q*8;
		ni_li[1]=H*4;
		ni_li[2]=S*2;
		ni_li[3]=D;
		long ni_saiyasu=Math.min(Math.min(ni_li[0], ni_li[1]), Math.min(ni_li[2], ni_li[3]));
		
		long N=sc.nextLong();
		long sum=0;
		
		if(ichi_saiyasu*2>=ni_saiyasu) {
			System.out.println((N/2)*ni_saiyasu+(N%2)*ichi_saiyasu);
		}
		
		else if(ichi_saiyasu*2<ni_saiyasu) {
			System.out.println(N*ichi_saiyasu);
		}
	}
}