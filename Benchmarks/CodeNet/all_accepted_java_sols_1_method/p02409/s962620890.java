import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b,f,r,v;
		int d[][][] = new int[4][3][10];

		for(int i=1;i<=n;i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			d[b-1][f-1][r-1] = d[b-1][f-1][r-1]+v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<=2;j++){
				for(int k=0;k<=9;k++){
					System.out.print(" "+d[i][j][k]);
				}
				System.out.println();
			}
			if(i!=3){
				System.out.println("####################");
			}
		}
	}
}