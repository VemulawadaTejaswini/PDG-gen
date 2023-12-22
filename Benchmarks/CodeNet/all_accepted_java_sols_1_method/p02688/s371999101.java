import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		HashSet<Integer>set = new HashSet<>();
		for (int i=1; i<=n; i++){
			set.add(i);
		}

		for (int i=1; i<=k; i++){
			int d = sc.nextInt();

			for (int j=1; j<=d; j++){
				int a = sc.nextInt();
				set.remove(a);
			}
		}
		System.out.println(set.size());
	}


}