import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] c = sc.nextLine().toCharArray();
		int[] cnt = new int[26];

		for (int i = 0; i < c.length; i++)
			cnt[(int)c[i] - 97]++;

		for (int i = 0; i < cnt.length; i++)
			System.out.println((char)(i + 97) + " : " + cnt[i]);


	}

}