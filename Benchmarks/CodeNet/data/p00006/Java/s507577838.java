import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			char[] s = str.toCharArray();
			StringBuilder sb = new StringBuilder(str.length());
			
			for(int i=str.length()-1;i>=0;i--) {
				sb.append(s[i]);
			}
			System.out.println(sb.toString());
		}
	}
}
