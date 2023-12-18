package extra;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int[][] height = new int[h][w];
			int[][] area = new int[h][w];

			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					height[i][j] = sc.nextInt();
					if (j!=0) {  //横比較
						if (height[i][j-1] > height[i][j]) area[i][j-1]++;
						else area[i][j]++;
					}
					if (i!=0) {  //横比較
						if (height[i-1][j] > height[i][j]) area[i-1][j]++;
						else area[i][j]++;
					}
				}
			}
			int count = 0;
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					//System.out.print(area[i][j] + "  ");
					if (area[i][j]>1) {
						int now = area[i][j];
						if (j!=0) {
							if (area[i][j-1] == 1) {  //左
								if (i!=0) {
									if (area[i-1][j]==1) now--;  //上
								}
								if (i!=h-1) {
									if (area[i+1][j]==1) now--;  //下
								}
							}
						}
						if (j!=w-1) {
							if (area[i][j+1] == 1) {  //右
								if (i!=0) {
									if (area[i-1][j]==1) now--;  //上
								}
								if (i!=h-1) {
									if (area[i+1][j]==1) now--;  //下
								}
							}
						}
						if (now > 1) count++;
					}
				}
				//System.out.println();
			}
			System.out.println(count);
		}
	}
}
