import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] bit = new char[64];
			String[] line = new String[8];
			int l = 0;
			for (int i = 0; i < 8; i++) {
				line[i] = sc.nextLine();
			}
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 8; k++) {
					bit[k + l] = line[j].charAt(k);
				}
				l += 8;
			}
			for (int m = 0; m < 64; m++) {
				if (bit[m] == '1') {
					if (bit[m + 1] == '1' & bit[m + 8] == '1'	& bit[m + 9] == '1') {
						System.out.println("A");
						break;
					} else if (bit[m + 8] == '1' & bit[m + 16] == '1'	& bit[m + 24] == '1') {
						System.out.println("B");
						break;
					} else if (bit[m + 1] == '1' & bit[m + 2] == '1'	& bit[m + 3] == '1') {
						System.out.println("C");
						break;
					} else if (bit[m + 8] == '1' & bit[m + 7] == '1'	& bit[m + 15] == '1') {
						System.out.println("D");
						break;
					} else if (bit[m + 1] == '1' & bit[m + 9] == '1'	& bit[m + 10] == '1') {
						System.out.println("E");
						break;
					} else if (bit[m + 8] == '1' & bit[m + 9] == '1'	& bit[m + 10] == '1') {
						System.out.println("F");
						break;
					} else if (bit[m + 1] == '1' & bit[m + 8] == '1'	& bit[m + 7] == '1') {
						System.out.println("G");
						break;
					}
				}
			}
		}
		sc.close();
	}
}