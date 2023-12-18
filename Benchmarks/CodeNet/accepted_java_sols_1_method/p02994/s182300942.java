import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int L = stdIn.nextInt();
		
		int sum = 0;
		int s = L;
		for(int i = 1; i <= N; i++) {
			sum += (L+i-1);
			if(Math.abs(L+i-1) < Math.abs(s)) {
				s = L+i-1;
			}
		}
		System.out.println(sum-s);

	}

}