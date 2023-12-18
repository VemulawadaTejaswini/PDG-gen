import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			X[i] = sc.nextInt();
		}
		int R = Integer.MAX_VALUE;
		for(int x = 1 ;  x <= 100 ; ++x){
			int S = 0;
			for(int v : X){
				int power = (v - x) * (v - x);
				S += power;
			}
			R = Math.min(R, S);			
		}
		System.out.println(R);		
	}
}
