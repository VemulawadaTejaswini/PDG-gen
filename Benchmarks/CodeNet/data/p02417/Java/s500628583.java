import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] count = new int[26];
		Scanner scan = new Scanner(System.in);
		do { //not false
			String str = scan.nextLine();
			for(int i=0;i < str.length(); i++) {
				if(str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'a' < 26) {
					count[str.charAt(i) - 'a']++;
				}else if(str.charAt(i) - 'A' >= 0 && str.charAt(i) - 'A' < 26) {
					count[str.charAt(i) - 'A']++;
				}if(str.length() == 0) {
					break;
				}
			}
		}while(scan.hasNextLine());
		scan.close();
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		for(int j=0; j<26; j++) {
			System.out.println(str2.charAt(j)+" : "+count[j]);
		}
	}
}
