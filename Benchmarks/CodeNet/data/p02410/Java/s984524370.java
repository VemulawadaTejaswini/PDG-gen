import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//n
		int n = sc.nextInt();
		//m
		int m = sc.nextInt();
		//A=n*mの要素
		int A[][] = new int[n][m];
		//B
		int B[] = new int [m];
		//C
		int C[] = new int[n];
		//A読み込む
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
			int a = sc.nextInt();
			A[i][j] = a;
			}
		}
		//B読み込む
		for(int k = 0;k<m;k++){
			int b = sc.nextInt();
			B[k] = b;
		}
		//Cに代入
		for(int l = 0;l<n;l++){
			for(int g = 0;g<m;g++){
				C[l] = C[l] + A[l][g] * B[g];
			}
			System.out.println(C[l]);
		}



	}

}

