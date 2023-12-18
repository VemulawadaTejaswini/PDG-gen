import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int productCnt = Integer.parseInt(line[0]);
		int capa = Integer.parseInt(line[1]);
		int[][] product = new int[productCnt][2];
		for(int i=0 ; i<productCnt ; i++) {
			line = s.nextLine().split(" ");
			product[i][0] = Integer.parseInt(line[0]);
			product[i][1] = Integer.parseInt(line[1]);
		}
		System.out.println(solve(productCnt, capa, product));
	}

	public static int solve(int productCnt, int capa, int[][] product) {
		int[][] result = new int[capa+1][productCnt+1];
		for(int i=1 ; i<=productCnt ; i++) {
			for(int j=1 ; j<=capa ; j++) {
				if(j<product[i-1][1]) {
					result[j][i] = result[j][i-1];
				}else {
					result[j][i] = Math.max(result[j][i-1],product[i-1][0] + result[j-product[i-1][1]][i-1]);
				}
			}
		}
		return result[capa][productCnt];
	}
}