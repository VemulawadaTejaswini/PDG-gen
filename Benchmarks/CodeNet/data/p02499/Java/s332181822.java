import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		int alpha[];
		int i;
		alpha = new int[26];
		while(sc.hasNext()){
			line = sc.nextLine();
			for(i = 0; i < line.length(); i++){
				if('A' <= line.charAt(i) && line.charAt(i) <= 'Z'){
					alpha[line.charAt(i) - 'A']++;
				}
				else if('a' <= line.charAt(i) && line.charAt(i) <= 'z'){
					alpha[line.charAt(i) - 'a']++;
				}
			}
		}		
		for(i = 0; i < 26; i++){
				System.out.printf("%c : %d\n", 'a' + i, alpha[i]);
		}
	}
}