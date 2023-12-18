
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int f1[][]=new int[3][10];
		int f2[][]=new int[3][10];
		int f3[][]=new int[3][10];
		int f4[][]=new int[3][10];

		for(int i=0;i<3;i++) {
			for(int j=0;j<10;j++) {
				f1[i][j]=0;
				f2[i][j]=0;
				f3[i][j]=0;
				f4[i][j]=0;
			}
		}
		for(int i=0;i<n;i++) {
			int buil=scan.nextInt();
			int f=scan.nextInt()-1;
			int r=scan.nextInt()-1;
			int num=scan.nextInt();
			switch(buil) {
				case 1:
					f1[f][r]+=num;
					break;
				case 2:
					f2[f][r]+=num;
					break;
				case 3:
					f3[f][r]+=num;
					break;
				case 4:
					f4[f][r]+=num;
					break;
				default:
					break;
			}

		}

		for(int k=0;k<4;k++) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<10;j++) {
					if(k==0) System.out.print(" "+f1[i][j]);
					if(k==1) System.out.print(" "+f2[i][j]);
					if(k==2) System.out.print(" "+f3[i][j]);
					if(k==3) System.out.print(" "+f4[i][j]);
				}
				System.out.println();
			}
			if(k<3)System.out.println("####################");
		}

		scan.close();
	}

}
