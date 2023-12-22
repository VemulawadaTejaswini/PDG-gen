import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] count=new int[26];
		try (Scanner scan=new Scanner(System.in)){
		while(scan.hasNextLine()) {
			String str=scan.nextLine();
			for(int i=0;i<str.length();i++) {
				if(0<=str.charAt(i)-'a' && str.charAt(i)-'a'<26)
				count[str.charAt(i)-'a']++;
				else if(0<=str.charAt(i)-'A' && str.charAt(i)-'A'<26)
				count[str.charAt(i)-'A']++;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.printf("%c : %d\n",i+'a',count[i]);
		}
		}
}
}
