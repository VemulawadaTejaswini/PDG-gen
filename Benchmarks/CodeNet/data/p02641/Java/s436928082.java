import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		if (N==0) {
			System.out.println(X);
			return ;
		}
		Set<Integer> set = new HashSet<Integer> ();
		for (int i=0;i<N;i++) {
			set.add(sc.nextInt());
		}
		for (int i=0;i<200;i++) {
			int temp = X+i;
			if (set.contains(temp)==false) {
				System.out.print(temp);
				return ;
			}
			temp = X-i;
			if (set.contains(temp)==false) {
				System.out.print(temp);
				return ;
			}
		}

	}
}