import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[256];
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			for(int i=0;i<str.length();i++){
				char c = Character.toLowerCase(str.charAt(i));
				count[c]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c : %d\n", 'a' + i, count['a'+ i]);
		}
	}

}