
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int x[][] = new int[h][w];

		for (int i = 0; i < h; i++) {
			String e = in.next();
			for (int j = 0; j < w; j++) {
				if (e.charAt(j) == '#') {
					x[i][j] = 1;
				} else {
                    x[i][j] = 0;
				}
			}
		}
		int sum=0;

		for(int i=0;i<h;i++) {//横
			for(int j=0;j<w;j++) {
				 sum +=x[i][j];
			}
			if(sum==0) {
				for(int j=0;j<w;j++) {
					 x[i][j]=2;
				}
			}
			sum=0;
		}


		for(int j=0;j<w;j++) {//縦
			for(int i=0;i<h;i++) {
				if(x[i][j]!=2) {
				sum +=x[i][j];
				}
			}
			if(sum==0) {
				for(int k=0;k<h;k++) {
					 x[k][j]=2;
				}
			}
			sum=0;
		}


		for(int i=0;i<h;i++) {//横
			for(int j=0;j<w;j++) {
				if(x[i][j]==1) {
					System.out.print('#');
				}
				if(x[i][j]==0) {
					System.out.print('.');
				}
				sum+=x[i][j];
			}
			if(sum!=w*2) {
				System.out.print('\n');
			}
			sum=0;
		}
	}
}