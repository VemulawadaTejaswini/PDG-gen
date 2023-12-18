import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String[] s = S.split("");
		int check = 0;
		
		for(int i = 0; i < s.length; i++) {
			int count = 0;
			for(int j = i; j < s.length; j++) {
				if(s[i].equals(s[j])) {
					count++;
				}
			}
			if(count >= 2) {
				System.out.println("no");
				check++;
				break;
			}
		}
		if(check == 0) {
			System.out.println("yes");
		}
	}
}
