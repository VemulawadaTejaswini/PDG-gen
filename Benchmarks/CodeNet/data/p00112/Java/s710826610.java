import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		for(;;) {
			int N = sc.nextInt();
			if(N == 0) break;
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i = 0; i < N; i++) {
				al.add(sc.nextInt());
			}
			Collections.sort(al);
			for(int i = 0; i < N; i++) System.out.println(al.get(i));
			int sum = 0;
			for(int i = 0; i < N; i++) {
				sum += al.get(i) * (N - i - 1);
			}
			System.out.println(sum);
		}
	}
}