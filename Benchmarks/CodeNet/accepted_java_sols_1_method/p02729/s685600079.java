import java.util.*;

class Main {
  	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
      	int M = scanner.nextInt();
      	int nPlusMChoose2 = (N+M) * (N+M-1) / 2;
		int oddCombos = N * M;
	    int result = nPlusMChoose2 - oddCombos;
		System.out.printf("%d\n", result);
    }
}