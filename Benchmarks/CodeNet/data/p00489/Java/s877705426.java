import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		int game = N * (N - 1) / 2;
		int[] win = {0,0,0,0};
		int A,B,C,D;
		int[] num = new int[4];
		
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
		
		Arrays.sort(win);
				
		for(int i = 0;i < 4;i++){
			System.out.println(win[i]);
		}
	}
}