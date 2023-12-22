import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double[] V = new double[N];
		for(int i = 0;i < N;i++){
			V[i] = Double.parseDouble(sc.next());
		}
		sc.close();
		Arrays.sort(V);
		for(int i = 0;i < N-1;i++){
			V[i+1] = (V[i] + V[i+1]) / 2;
		}
		System.out.println(V[N-1]);
	}
}