import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			if(stdIn.nextInt() >= K) count++;
		}
		
		System.out.println(count);

	}

}