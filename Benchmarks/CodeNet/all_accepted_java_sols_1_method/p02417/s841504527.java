import java.util.Scanner;

public class Main{
	public static  void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while(sc.hasNext()) {
			String str = sc.nextLine();
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if('a' <= ch && ch <= 'z') {
					count[str.charAt(i) - 'a']+=1;;
				}
				else if('A' <= ch && ch <= 'Z') {
					count[str.charAt(i) - 'A']+=1;;
				}
			}
		}
		for(int i = 0; i < 26; i++){
			char ch = (char)('a' + i);
			System.out.println(ch + " : " + count[i]);
	    }
	}
}




