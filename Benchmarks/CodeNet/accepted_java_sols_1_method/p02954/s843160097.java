import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char[] C = S.toCharArray();
		int len = C.length;
		int[] childs = new int[len];
		int Rstart = 0;
		int Rend = 0;
		int Lstart = 0;
		int idx;

		char prevChar = 'R';
		for (idx = 1; idx <= len; idx++) {

			if (idx == len || C[idx] == 'R') {
				//R
				if (prevChar == 'L') {
					//(L→)R
					childs[Lstart - 1] += (idx - Lstart) / 2;
					childs[Lstart] += (idx - Lstart + 1) / 2;

					//
					Rstart =  idx;
				}
				prevChar = 'R';
			} else {
				//L
				if (prevChar == 'R') {
					//(R→)L
					childs[idx - 1] = (idx - Rstart + 1) / 2;
					childs[idx] = (idx - Rstart) / 2;

					Rend = idx - 1;
					Lstart = idx;
				}
				prevChar = 'L';
			}
		}

		// output
		for (idx = 0; idx < len; idx++) {
			System.out.print(childs[idx] + " ");

		}

	}

}
