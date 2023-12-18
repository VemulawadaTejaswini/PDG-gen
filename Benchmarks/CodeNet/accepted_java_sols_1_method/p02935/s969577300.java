import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		double[] v = new double[N];
		for(int i = 0; i < N; i++) {
			v[i] = stdIn.nextInt();
		}
		Arrays.sort(v);
		
		double temp = (v[0]+v[1])/2;
		for(int i = 2; i < N; i++) {
			temp = (temp+v[i])/2;
		}
		
		System.out.println(temp);

	}

}