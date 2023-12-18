import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] alphabets = new int[26];
			while(sc.hasNext()) {
				String str = sc.nextLine();
				for(int i = 0;i<str.length();i++) {
					char ch = str.charAt(i);
					if(64<ch&&ch<91) {
						alphabets[ch-65]++;
					}
					else if(96<ch&&ch<123) {
						alphabets[ch-97]++;
					}
				}
			}
			for(int i = 0;i<26;i++) {
				System.out.println(String.format("%c : %d", (char)i+97, alphabets[i]));
			}
		}
	}
}
