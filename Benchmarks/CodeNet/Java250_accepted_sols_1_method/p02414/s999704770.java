import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int 
			 	n,
				m,
				l;
				
		long[][]
				A,
				B,
				C;
				
		String output;
		
		//入力処理
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		l = Integer.parseInt(sc.next());
		
		//サイズの指定
		A = new long[n][m];
		B = new long[m][l];
		C = new long[n][l];
		
		//A行列の入力
		for(int i = 0;i < n;i++){
			
			for(int k = 0;k < m;k++){
				
				A[i][k] = Integer.parseInt(sc.next());
			}
		}
		
		//B行列の入力
		for(int k = 0;k < m;k++){
			
			for(int j = 0;j < l;j++){
				
				B[k][j] = Integer.parseInt(sc.next());
			}
		}
		
		//C行列の計算
		for(int k = 0;k < m;k++){
			
			for(int i = 0;i < n;i++){
				
				for(int j = 0;j < l;j++){
					
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		//出力処理
		for(int i = 0;i < n;i++){
			
				output = "";
				
				for(int j = 0;j < l;j++){
					
					output += C[i][j];
					//数字の間にスペースを入れる
					if(j < l - 1)output += " ";
				}
				
				System.out.print(output + "\n");
				
		}
		
	}
}

