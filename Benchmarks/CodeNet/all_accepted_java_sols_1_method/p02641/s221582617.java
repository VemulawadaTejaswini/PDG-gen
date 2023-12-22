import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();
		int min = 0;
		int max = 101;
		Integer[] p = new Integer[N];
		for(int i=0; i<N ;i++) {
			p[i] = sc.nextInt();
		}
	if(N != 0) {
		for(int i = 1; i <=101; i++) {
			//配列内に要素が存在していなければ入る
			if(!Arrays.asList(p).contains(i)) {
				min = min<=i && i<=X? i:min;
				max = i<=max && i>=X? i:max;
			}
		}
		if(Math.abs(min-X) <= Math.abs(max-X)){
			System.out.println(min);
		}else {
			System.out.println(max);
		}

	}else {
		System.out.println(X);
	}

	}
}
