import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		while(sc.hasNextLine()) {
			stb.append(sc.nextLine().toLowerCase());
		}
		String str = stb.toString();
		char cStr;
		char a = 'a';
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			cStr = str.charAt(i);
			for(int j = 0; j < 26; j++) {
				if(cStr == (char)(a + j)) {
					count[j]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println((char)(a + i) + " : " + count[i]);
		}
		sc.close();
	}
}
