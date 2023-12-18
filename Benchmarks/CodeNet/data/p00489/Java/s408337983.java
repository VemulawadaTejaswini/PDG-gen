import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		int game = N * (N - 1) / 2;
		int[] win = new int[N];
		int[] num = new int[N];
		int A,B,C,D;
		
		for(int i = 0;i < game;i++){
			A = S.nextInt();
			B = S.nextInt();
			C = S.nextInt();
			D = S.nextInt();
			
			if(C > D){
				win[A - 1] += 3;
			}
			if(D > C){
				win[B - 1] += 3;
			}
			if(C == D){
				win[A - 1]++;
				win[B - 1]++;
			}
		}
		
		for(int i = 0;i < N;i++){
			int n = N;
			for(int j = 0;j < N;j++){
				if(win[i] > win[j])
					n--;
			}
			num[i] = n;
		}
		
		for(int i = 0;i < N - 1;i++){
			for(int j = i + 1;j < N;j++){
				if(num[i] == num[j]){
					num[i]--;
					num[j]--;
				}
			}
		}
		
		for(int i = 0;i < N;i++){
			System.out.println(num[i]);
		}
	}
}