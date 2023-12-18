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

	int[][] friend;
	int[] size;
	int[] group;

	public Sns(int n) {
		friend = new int[n][100];
		size = new int[n];
		group = new int[n];
		for (int i = 0; i < n; i++)
			group[i] = -1;
	}

	public boolean isFriends(int s, int t) {
		if (group[s] == -1)
			setGroup(s);
		if (group[s] == group[t])
			return true;
		else
			return false;
	}

	private void setGroup(int s) {
		group[s] = s;
		int[] que = new int[group.length];
		que[0] = s;
		int pp = 0, pn = 1;
		for (; pp < pn; pp++) {
			for (int i = 0; i < size[que[pp]]; i++) {
				int next = friend[que[pp]][i];
				if (group[next] == -1) {
					group[next] = s;
					que[pn++] = next;
				}
			}
		}
	}

	public void add(int s, int t) {
		friend[s][size[s]++] = t;
		friend[t][size[t]++] = s;
	}

}