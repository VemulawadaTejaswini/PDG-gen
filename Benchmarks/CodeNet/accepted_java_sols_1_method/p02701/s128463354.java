import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		//String[] keihin = new String[N];

		HashSet<String> keihin = new HashSet<String>();
		for (int i = 0; i < N; i++) {
			keihin.add(sc.next());
		}
		System.out.println(keihin.size());
	}

}