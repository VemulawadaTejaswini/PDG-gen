import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] result = new int[10000];
		int index = 0;
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int a = stdIn.nextInt();
		while( n != 0 || m != 0 || a != 0 ){
			int[] h = new int[m];
			int[] p = new int[m];
			int[] q = new int[m];
			int[][] check = new int[1001][n+1];
			int hMax = 0;
			for(int i = 0; i < m; i++){
				h[i] = stdIn.nextInt();
				p[i] = stdIn.nextInt();
				q[i] = stdIn.nextInt();
				if( h[i] > hMax ){
					hMax = h[i];
				}
				check[h[i]][p[i]] = q[i];
				check[h[i]][q[i]] = p[i];
			}
			int now = a;
			for(int i = hMax; i > 0; i--){
				if( check[i][now] != 0 ){
					now = check[i][now];
				}
			}
			result[index] = now;
			index++;
			n = stdIn.nextInt();
			m = stdIn.nextInt();
			a = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}