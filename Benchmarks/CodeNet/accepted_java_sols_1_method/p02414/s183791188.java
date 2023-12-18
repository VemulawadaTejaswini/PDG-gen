import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int[][] a = new int[x][y];
		int[][] b = new int[y][z];

		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<y;i++) {
			for(int j=0;j<z;j++) {
				b[i][j] = sc.nextInt();
			}
		}

		long tmp = 0;

		for(int i=0;i<x;i++) {
			for(int j=0;j<z;j++) {
				for(int k=0;k<y;k++) {
					tmp += a[i][k] * b[k][j];
				}
				System.out.print(tmp);
				if(j!=z-1) {
					System.out.print(" ");
				}
				tmp = 0;
			}
			System.out.println();
		}

		sc.close();
	}
}
