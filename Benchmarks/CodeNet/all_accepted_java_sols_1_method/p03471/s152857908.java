import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int Y = stdIn.nextInt();
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N-i; j++) {
				if(10000*i+5000*j+1000*(N-i-j) == Y) {
					System.out.println(i+ " " +j+ " "+ (N-i-j));
					System.exit(0);
				}
			}
		}
		System.out.println("-1 -1 -1");

	}

}