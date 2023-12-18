public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[][] A = new int[n][m];
		int[] B = new int[m];
		int c;

		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i<m;i++){
			B[i] = scan.nextInt();
		}
		for(int i = 0;i<n;i++){
			c = 0;
			for(int j = 0;j<m;j++){
				c +=  A[i][j]*B[j];
			}
			System.out.println(c);
		}
	}
}