import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int bfr[][][]= new int[4][3][10];
		int b,f,r;
		int v=0;

		for(int i=0;i<n;++i){
			b= sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			bfr[b-1][f-1][r-1]= bfr[b-1][f-1][r-1] + v;
		}
		for (int a=0;a<=3;++a){
			for (int aa =0;aa<=2;++aa){
				for (int aaa = 0; aaa<=9;++aaa){
					System.out.print(" "+bfr[a][aa][aaa]);
				}
				System.out.println();
			}
			if (a!=3)System.out.println("####################");
		}

	}
}
