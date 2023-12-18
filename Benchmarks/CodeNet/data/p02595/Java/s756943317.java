import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int count = 0;
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0; i < N; i ++){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i ++){
			if(Math.sqrt((X[i] * X[i]) + (Y[i] * Y[i])) <= D){
				count ++;
			}
		}
		System.out.println(count);
	}
}