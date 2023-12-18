import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int num = Integer.parseInt(sc.next());
		int[] score = new int[2];
		for (int i=0; i < num; i++) {
			String str = sc.next().toLowerCase(),nextStr = sc.next().toLowerCase();
			char[] a = str.toCharArray(), b = nextStr.toCharArray();
			if (str.equals(nextStr)) {
				score[0]++; score[1]++;
			} else {
				for (int j=0; j < a.length; j++) {
					if (b[j] < a[j]) {
						 score[0] += 3;
						 break;
					} else if (a[j] < b[j]) {
						score[1] += 3;
						break;
					}
				}
			}
		}
		sc.close(); System.out.println(score[0] + " " + score[1]);
	}
}