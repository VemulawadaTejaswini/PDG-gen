import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, p;
		int id, s;
		int k[];
		
		while (true) {
			n = sc.nextInt();
			p = sc.nextInt();
			if ((n | p) == 0) {
				break;
			}
			k = new int[n];
			id = 0;
			s = p;
			while (true) {
				if (s == 0) {
					s = k[id];
					k[id] = 0;
				} else {
					s--;
					k[id]++;
					if (k[id] == p) {
						break;
					}
				}
				id = (id + 1) % n;
			}
			System.out.println(id);
		}
	}
}