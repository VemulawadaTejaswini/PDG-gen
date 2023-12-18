import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count[] = new int[26];

		for(int i=0; i<26; i++) count[i]=0;
		while(sc.hasNext()){
			str = sc.next();
			str = str.toLowerCase();
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i)-'a'<26 && str.charAt(i)-'a'>=0){
					count[str.charAt(i)-'a']++;
				}
			}
		}
		for(int i=0; i<26; i++){
			System.out.printf("%c : %d\n", (int)'a'+i, count[i]);
		}
	}
}