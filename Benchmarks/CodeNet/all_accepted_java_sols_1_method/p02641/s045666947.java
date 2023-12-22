import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		Integer[] p = new Integer[N];
		int b = 1000;
		int d = 0;
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<X*2; i++) {
			if(Arrays.asList(p).contains(i)) {
				continue;
			}else {
					int c = Math.abs(X-i);
					if(b>c) {
						b = c;
						d = i;
					}
				}
			}
		System.out.println(d);
	}

}
