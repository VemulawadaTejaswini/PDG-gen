import java.util.*;
import java.io.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) throws IOException {
		int n = sc.nextInt();
		sc.nextLine();
		int[] counts = new int[26];
		Arrays.fill(counts, 50);
		for(int i = 0; i < n; i++) {
			String curr = sc.nextLine();
			int[] countsCurr = new int[26];
			for(int j = 0; j < curr.length(); j++) {
				String letter = curr.substring(j, j+1);
				int index = alphabet.indexOf(letter);
				countsCurr[index]++;
			}
			for(int j = 0; j < 26; j++) {
				counts[j] = Math.min(counts[j], countsCurr[j]);
			}
		}

		String ans = "";
		for(int i = 0; i < 26; i++) {
			if(counts[i] > 0) {
				int countLetter = counts[i];
				for(int j = 0; j < countLetter; j++) {
					ans += alphabet.charAt(i);
				}
			}
		}

		System.out.println(ans);
	}
}