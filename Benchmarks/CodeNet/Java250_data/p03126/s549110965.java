import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.abc118B();
	}
}

class Calc{
  void abc118B() {
		Scanner sc = new Scanner(System.in);
		int like=0, cnt=0;
		boolean check = false;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] k = new int[n];
		int[][] food = new int[n][30];
		for(int i=0 ; i<n ; i++) {
			k[i] = sc.nextInt();
			for(int j=0 ; j<k[i] ; j++) {
				food[i][j] = sc.nextInt();
			}
		}
		for(int i=1 ; i<=m ; i++) {
			//縦列
			for(int j=0 ; j<n ; j++) {
				//横一列
				for(int p=0 ; p<k[j] ; p++) {
					if( i == food[j][p] ) {
						like ++;
					}
				}
			}
			if(like == n) {
				cnt++;
			}
			like = 0;
		}
		System.out.println(cnt);
	}
}