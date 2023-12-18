import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if(N != 1 && M != 1) {
			System.out.println(N * M - N * 2 - M * 2 + 4);
		} else if(N != 1 || M != 1){
			System.out.println(Math.max(N, M) - 2);
		} else {
			System.out.println(1);
		}
	}
}
