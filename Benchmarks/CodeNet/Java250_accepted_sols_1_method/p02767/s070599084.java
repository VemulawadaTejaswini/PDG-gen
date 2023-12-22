import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = 0;
		int pow = 0;
		int av = 0;
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			total += X[i];
		}
		if ((10*total/N)%10 < 5) {
			av = total/N;
		} else {
			av = total/N + 1;
		}
		for (int x : X) {
			int p = x - av;
			pow += p*p;
		}
		System.out.println(pow);
	}
}