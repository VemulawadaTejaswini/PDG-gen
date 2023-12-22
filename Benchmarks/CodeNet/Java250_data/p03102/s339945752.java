import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;
		
		int[] B = new int[M];
		for(int i = 0;i < M;i++){
			B[i] = sc.nextInt();
		}
		for(int i = 0;i < N;i++){
			int sum = 0;
			for(int j = 0;j < M;j++){
				sum += sc.nextInt() * B[j];
			}
			sum += C;
			if(sum > 0){
				ans++;
			}
		}
		System.out.print(ans);
		
		
	}
	
	
}

