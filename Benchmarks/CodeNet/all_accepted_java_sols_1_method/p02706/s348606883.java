import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	int total = 0;
      	for (int i = 0; i < M; i++) {
          total += sc.nextInt();
        }
      	System.out.println(N < total ? -1 : N-total);
	}
}