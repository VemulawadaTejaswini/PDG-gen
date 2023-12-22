import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			
			int [][]A = new int [2][N];
			
			for(int i = 0;i<N;i++)A[0][i] = scan.nextInt();
			for(int i = 0;i<N;i++)A[1][i] = scan.nextInt();
			
			int max = 0;
			
			for(int i =0;i<N;i++) {//i番目の１で下にずれる
				int goukei = 0;
				goukei+=A[0][0];
				for(int j = 0;j<i;j++) {//iが0なら計算する必要ないi-1までやる
					goukei+=A[0][j+1];
				}
				goukei+=A[1][i];
				
				for(int j = i;j<N-1;j++) {//iがN-1なら必要ない、Nー1−1までやる。
					goukei+=A[1][j+1];
				}
				
				if(max<goukei)max= goukei;
				
			}
			
			
			System.out.println(max);
			
			
		}
		
		
	}
		

}
