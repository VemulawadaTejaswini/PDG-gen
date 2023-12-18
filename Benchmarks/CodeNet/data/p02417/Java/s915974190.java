import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int ans[] = new int[26];
		while(sc.hasNext()) {
			s =sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < 26; j++) {
					if (Character.toLowerCase(s.charAt(i)) == alp.charAt(j)) {
						ans[j]++;
					}
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println(alp.charAt(i) + " : " + ans[i]);
		}
	}
}
