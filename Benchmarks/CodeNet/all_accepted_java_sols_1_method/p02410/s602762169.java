import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] v = new int[x][y];
		int[] a = new int[y];

		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				v[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<y;i++) {
			a[i] = sc.nextInt();
		}

		int tmp = 0;

		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				tmp += v[i][j] * a[j];
			}
			System.out.println(tmp);
			tmp = 0;
		}
		sc.close();
	}
}
