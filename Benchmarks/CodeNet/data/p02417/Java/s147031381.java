import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] num = new int[26];

			while(sc.hasNext()) {
				String str = sc.nextLine();
				for(int i = 0;i < str.length();i++) {
					for(int j = 65;j <= 90; j++) {
						char ch = str.charAt(i);
						if(ch == (char)j || ch == (char)j + 32) {
							num[j - 65]++;
						}
					}
				}
			}

			for(int i = 97; i <= 122; i++) {
				System.out.println((char)i + " : " + num[i - 97]);
			}
		}
	}
}

