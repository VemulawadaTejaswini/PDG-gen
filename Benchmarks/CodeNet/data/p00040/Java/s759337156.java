import java.util.*;

public class Main {
	private int[] afin = new int[26];
	private String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", 
			"r", "s", "t", "u", "v", "w", "x", "y", "z"};

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		while (n-- > 0) {
			String str = scan.nextLine();
			for (int a = 0; a < 26; a++) {
				boolean find = false;
				for (int b = 0; b < 26; b++) {
					boolean[] confirm = new boolean[26];
					Arrays.fill(confirm, false);
					boolean flag = true;
					for (int i = 0; i < 26; i++) {
						if (!confirm[(a * i + b) % 26]) confirm[(a * i + b) % 26] = true;
						else {flag = false; break;}
					}
					if (flag) {
						for (int i = 0; i < 26; i++) {
							afin[i] = (a * i + b) % 26;
						}
						//System.out.println("a:"+ a + " b:" + b + Arrays.toString(afin));
						StringBuffer str2 = new StringBuffer();
						for (int i = 0; i < str.length(); i++) {
							if (str.substring(i, i + 1).equals(" ")) {
								str2.append(str.substring(i, i + 1));
							}else {
								int j = 0;
								while (!str.substring(i, i + 1).equals(alpha[j++]));
								str2.append(alpha[afin[j - 1]]);
							}
						}
						//System.out.println(str2);
						
						if (str2.indexOf("this") >= 0 || str2.indexOf("that") >= 0) {
							System.out.println(str2);
							find = true;
							break;
						}
					}
				}
				if (find) break;
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}