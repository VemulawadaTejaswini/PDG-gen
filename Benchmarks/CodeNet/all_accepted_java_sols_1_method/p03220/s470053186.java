import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double T = Double.parseDouble(sc.next());
		double A = Double.parseDouble(sc.next());
		double[] H = new double[N];
		for(int i = 0;i < N;i++) {
			H[i] = Double.parseDouble(sc.next());
		}
		sc.close();
		int index = 0;
		double dist = 1000;
		for(int i = 0;i < N;i++) {
			if(Math.abs(A - (T - H[i] * 0.006)) < dist) {
				dist =Math.abs(A - (T - H[i] * 0.006));
				index = i+1;
			}
		}
		System.out.println(index);
	}
}