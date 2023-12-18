import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 整数の入力 高橋
		int T= sc.nextInt();
		// 整数の入力　青木
		int A = sc.nextInt();
		// 整数の入力　ループ回数
		int K = sc.nextInt();
		
		boolean aoki = false;
		for(int i = 0 ; i < K; i++){
			
			//trueなら青木
			if(aoki){
				
				//偶数
				if(A % 2 == 0){
					T += A / 2;
					A -= A / 2;
				}
				//奇数
				else{
					if(A  == 0){
						continue;
					}
					A -= 1;
					T += A / 2;
					A -= A / 2;
				}
				aoki = false;
			}
			else{
				//偶数
				if(T % 2 == 0){
					A += T / 2;
					T -= T / 2;
				}
				//奇数
				else{
					if(T  == 0){
						continue;
					}
					T -= 1;
					A += T / 2;
					T -= T / 2;
				}
				aoki = true;
			}
		}
		System.out.print(T + " ");
		System.out.print(A);
	}
}
