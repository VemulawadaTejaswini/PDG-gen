import java.util.Scanner;

class JOI {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int[][] population = new int[h][w];
			int[] hSum = new int[h]; //hの人口総和
			int[] wSum = new int[w]; //wの人口総和
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					population[i][j] = sc.nextInt();
				}
			}
			int min = 10000000;
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					int count = 0;
					for (int k=0; k<h; k++) {
						for (int l=0; l<w; l++) {
							int toh = Math.abs(k-i);
							int tow = Math.abs(j-l);
							count += Math.min(toh, tow) * population[k][l];
						}
					}
					min = Math.min(min, count);
				}
			}
			System.out.println(min);
		}
	}
}
