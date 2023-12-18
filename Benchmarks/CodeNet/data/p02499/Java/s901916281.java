import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char last;
		int count[] = new int[26];

		for(int i=0; i<26; i++) count[i]=0;
		while(true){
			str = sc.next();
			str = str.toLowerCase();
			last = str.charAt(str.length()-1);
			if(last=='.') str = str.substring(0,str.length()-1);
			for(int i=0; i<str.length(); i++){
				count[str.charAt(i)-'a']++;
			}
			if(last=='.') break;
		}
		for(int i=0; i<26; i++){
			System.out.printf("%c : %d\n", (int)'a'+i, count[i]);
		}
	}
}