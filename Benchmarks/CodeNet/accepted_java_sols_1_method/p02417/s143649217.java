import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String text;;
		char x;
		int [] az = new int[26];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			text=sc.nextLine();
			for(int i =0; i<text.length(); i++) {
				x=text.charAt(i);
				if ('a'<=x && x<='z') {
					az[x-97]++;
				}
				else if ('A'<=x && x<='Z') {
					az[x-65]++;
				}
			}
		}
		for (int i=0; i<26; i++) {
			System.out.println((char)(i+97)+" : "+az[i]);
		}
	}
}

