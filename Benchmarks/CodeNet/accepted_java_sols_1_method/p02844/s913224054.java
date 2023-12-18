import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String[] input = S.split("");
		int[] ansArray = new int[1000];
		for (int i = 0; i < 1000; i++) {
			String cipher = String.format("%03d", i);
			String[] cipherSplit = cipher.split("");
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (cipherSplit[count].equals(input[j])) {
					count++;
				}
				if (count > 2) {
					ansArray[Integer.parseInt(cipher)] = 1;
					break;
				}
			}
		}
		int res = 0;
		for (int count : ansArray) {
			res += count;
		}
		System.out.print(res);
	}
}
