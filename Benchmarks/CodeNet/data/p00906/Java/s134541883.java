
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final void main(String[] args) {
		new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(n==0 && m==0 && a==0 && b==0 && c==0 && t==0)
				break;
			
			int[] s = new int[n];
			for(int i=0;i<n;i++)
				s[i] = sc.nextInt();
	
			solve(n, m, a, b, c, t, s);
		}
		sc.close();
	}

	private void solve(int n, int m, int a, int b, int c, int t, int[] s) {
		int[][] mat = new int[n][n];
		
		for(int i=1;i<n;i++)
			mat[i][i-1] = a;
		for(int i=0;i<n;i++)
			mat[i][i] = b;
		for(int i=0;i<n-1;i++)
			mat[i][i+1] = c;
		
		mat = mulMat(mat, t, m);
//		for(int i=0;i<mat.length;i++)
//			System.out.println(Arrays.toString(mat[i]));
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=0;j<n;j++){
				sum += mat[i][j]*s[j];
				sum %= m;
			}
			sb.append(sum).append(' ');
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		
	}
	
	private int[][] mulMat(int[][] mat, int mult, int mod){
		int n = mat.length;
		int[][] retMat = new int[n][n];
		for(int i=0;i<n;i++)
			retMat[i][i] = 1;
		
		int c = 1;
		while(c<=mult){
			if((c&mult) > 0){
				retMat = mulMat(retMat, mat, mod);
			}
			mat = mulMat(mat, mat, mod);
			
			c*=2;
		}
		return retMat;
	}
	
	/** mat1???????????\??? */
	private int[][] mulMat(int[][] mat1, int[][] mat2, int mod){
		int n = mat1.length;
		int[][] retMat = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int sum = 0;
				for(int k=0;k<n;k++)
					sum += mat1[i][k]*mat2[k][j];
				retMat[i][j] = sum%mod;
			}
		}
		return retMat;
	}
	
}