import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1000; int max = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a < min) min = a;
			if(a > max) max = a;
		}
		System.out.println(max - min);
	}
}
