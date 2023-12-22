import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[][][] array = new int[4][3][10];
		for(int i=0;i<x;i++) {
			int t = sc.nextInt();
			int k = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();
			array[t-1][k-1][b-1] += p;
		}

		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					System.out.print(" " + array[i][j][k]);
				}
				System.out.println();
			}
			if(i!=4-1) {
				System.out.println("####################");
			}
		}
		sc.close();
	}
}
