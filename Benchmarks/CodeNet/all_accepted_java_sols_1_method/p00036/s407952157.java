import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][][] pattern = 
			{
				{
					{1,1,0,0},
					{1,1,0,0},
					{0,0,0,0},
					{0,0,0,0},
				},
				{
					{1,0,0,0},
					{1,0,0,0},
					{1,0,0,0},
					{1,0,0,0},
				},
				{
					{1,1,1,1},
					{0,0,0,0},
					{0,0,0,0},
					{0,0,0,0},
				},
				{
					{0,1,0,0},
					{1,1,0,0},
					{1,0,0,0},
					{0,0,0,0},
				},
				{
					{1,1,0,0},
					{0,1,1,0},
					{0,0,0,0},
					{0,0,0,0},
				},
				{
					{1,0,0,0},
					{1,1,0,0},
					{0,1,0,0},
					{0,0,0,0},
				},
				{
					{0,1,1,0},
					{1,1,0,0},
					{0,0,0,0},
					{0,0,0,0},
				},
			};
		Scanner sc = new Scanner(System.in);
		CASE: while(sc.hasNext()) {
			int[][] m = new int[12][12];
			for(int i=0;i<8;i++) {
				String s = sc.next();
				for(int j=0;j<8;j++) {
					m[i][j] = s.charAt(j) - '0';
				}
			}
			for(int k=0;k<7;k++) {
				for(int i=0;i<8;i++) {
					LOOP: for(int j=0;j<8;j++) {
						for(int i2=0;i2<4;i2++) {
							for(int j2=0;j2<4;j2++) {
								if ((m[i+i2][j+j2] ^ pattern[k][i2][j2]) != 0) {
									continue LOOP;
								}
							}
						}
						System.out.println((char) ('A' + k));
						continue CASE;
					}
				}
			}
		}

	}

}