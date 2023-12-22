import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p [] = new int [n], k = 0;
		for (int i = 0; i < n; p[i] = sc.nextInt(), i++);
		for (int i = n - 2; i > 0; k += (((p[i - 1] < p[i]) && (p[i] < p[i + 1])) || ((p[i - 1] > p[i]) && (p[i] > p[i + 1]))) ? 1 : 0, i--);
		System.out.println(k);
  	}
}