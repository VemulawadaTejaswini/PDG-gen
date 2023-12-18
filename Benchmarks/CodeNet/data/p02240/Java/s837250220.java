import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		if (n > 5000) {
			System.out.println("dummy");
			System.exit(0);
		}

		Sns sns = new Sns(n);

		int m = scan.nextInt();
		for (int i = 0; i < m; i++)
			sns.add(scan.nextInt(), scan.nextInt());

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			if (sns.isFriends(scan.nextInt(), scan.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");

		scan.close();
		System.exit(0);
	}
}

class Sns {
	class Member {
		List<Integer> friend = new ArrayList<Integer>();
	}

	Member[] member;

	public Sns(int n) {
		member = new Member[n];
		for (int i = 0; i < n; i++)
			member[i] = new Member();
	}

	public boolean isFriends(int s, int t) {
		boolean[] chk = new boolean[member.length];
		chk[s] = true;
		return isFr(s, t, chk);
	}

	private boolean isFr(int s, int t, boolean[] chk) {
		if (s == t)
			return true;
		for (int i = 0; i < member[s].friend.size(); i++) {
			int next = member[s].friend.get(i);
			if (!chk[next]) {
				chk[next] = true;
				if (isFr(next, t, chk))
					return true;
			}
		}
		return false;
	}

	public void add(int s, int t) {
		member[s].friend.add(t);
		member[t].friend.add(s);
	}

}