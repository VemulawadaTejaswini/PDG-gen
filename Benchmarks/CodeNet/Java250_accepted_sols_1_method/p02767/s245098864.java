import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		double sum = 0;
		for(int i = 0; i < N; i++){
			X[i] = sc.nextInt();
			sum += X[i];
		}
		double avr = sum/N;
		avr = Math.round(avr);
		int r = 0;
		for(int i = 0; i < N; i++) {
			r += (X[i] - avr) * (X[i] - avr);
		}
		System.out.println(r);
	}
}