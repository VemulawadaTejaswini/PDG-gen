import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc046.contest.atcoder.jp/tasks/abc046_a
 */
public class Main {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		set.add(sc.nextInt());
		set.add(sc.nextInt());
		set.add(sc.nextInt());
		sc.close();
		
		System.out.println(set.size());

	}

}