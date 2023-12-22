import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		String[] S = s.split("");
		int slength = s.length();
		int plength = p.length();
		int same =0;
		for (int i = 0; i < slength; i++) {
			if (same == 1) {
				break;
			}
			StringBuilder smalls =new StringBuilder();
			int k = 0;
			int j = i;
			while (true) {
				smalls.append(S[j]);
				j++;
				k++;
				if (j >= slength) {
					j = 0;
				}
				if (k == plength) {
					if (smalls.toString().equals(p)) {
						System.out.println("Yes");
						same = 1;
					}
					break;
				}
			}
		}
		if (same == 0) {
			System.out.println("No");
		}
	}
}