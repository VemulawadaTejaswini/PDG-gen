import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String W = sc.nextLine();
		String T = "";
		String line = sc.nextLine();
		while (!"END_OF_TEXT".equals(line)) {
			T += line;
			line = sc.nextLine();
		}
		int cnt = 0;
		for (;;) {
			int index = T.indexOf(W);
			if (index == -1) break;
			cnt++;
			if (index+1 >= T.length()) break;
			T = T.substring(index+1);
		}
		System.out.println(cnt);
	}
}

