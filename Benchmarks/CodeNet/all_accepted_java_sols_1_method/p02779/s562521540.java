import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Set<Long> set = new HashSet<>();

		for(int i=0;i<N;i++) {
			set.add(sc.nextLong());
		}
		System.out.println(set.size()==N?"YES":"NO");
	}
}
