
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int W=sc.nextInt();
		int H=sc.nextInt();
		int N=sc.nextInt();
		int[][] max=new int[W][H];

		for(int i=0; i<=W-1; i++) {
			for(int j=0; j<=H-1; j++) {
				max[i][j]=0;
			}
		}

		for(int i=1; i<=N; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(c%4==1) {
				for(int j=0; j<a; j++) {
					for(int k=0; k<=H-1; k++) {
						max[j][k]=1;
					}
				}
			}
			else if(c%4==2) {
				for(int j=W-1; j>=a; j--) {
					for(int k=0; k<=H-1; k++) {
						max[j][k]=1;
					}
				}
			}
			else if(c%4==3) {
				for(int j=0; j<=W-1; j++) {
					for(int k=0; k<b; k++) {
						max[j][k]=1;
					}
				}
			}

			else if(c%4==0) {
				for(int j=0; j<=W-1; j++) {
					for(int k=b; k<=H-1; k++) {
						max[j][k]=1;
					}
				}
			}
		}
		int sou=0;
		for(int i=0; i<=W-1; i++) {
			for(int j=0; j<=H-1; j++) {
				if(max[i][j]==0) {
					sou++;
				}
			}
		}
		System.out.println(sou);
	}
}