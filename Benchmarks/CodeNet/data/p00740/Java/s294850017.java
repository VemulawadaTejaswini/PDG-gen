import java.util.Scanner;

class main {
	public static void main(String[] args) {
		while (true) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int p = s.nextInt();
			if (n == 0 && p == 0) {
				break;
			}
			int pos = 0;
			int wan = p;
			int person[] = new int[n];
			for (int i = 0; i < n; i++) {
				person[i] = 0;
			}
			while (true) {
				if (wan != 0) {
					person[pos]++;
					wan--;
					if (person[pos] == p) {
						break;
					} // if2
				} // if2
				else {
					wan = person[pos];
					person[pos] = 0;
				} // else
				pos++;
				if (pos == n) {
					pos = 0;
				} // if3
			} // while2
			System.out.println(pos);
		} // while1
	}// method
}// class