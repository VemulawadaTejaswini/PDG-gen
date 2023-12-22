import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int num = 0;
		int foo[] = new int[N];
		for (int i = 0; i < N; i++) {
			foo[i] = sc.nextInt();
			X -= foo[i];
			num++;
		}
		int min = foo[0];
		for (int j = 1; j < foo.length; j++) {
			min = Math.min(min, foo[j]);
		}
		while (X >= 0) {
			X -= min;
			num++;
		}
		if (X < 0) {
			num -= 1;
		}
		System.out.println(num);
	}
}