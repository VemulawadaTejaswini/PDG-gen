import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		HashSet<Integer> type = new HashSet<>();

		for(int i=0 ; i<num ; i++) {
			type.add(sc.nextInt());
		}

		System.out.println(type.size() < num ? "NO" : "YES");
	}
}
