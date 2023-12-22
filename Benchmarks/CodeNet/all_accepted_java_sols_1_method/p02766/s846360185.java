import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int P = K;
		int i = 0;
		while(P <= N) {
			P = P*K;
			i++;
		}
		System.out.println(i+1);
	}
}