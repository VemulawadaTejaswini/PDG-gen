import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String ans = "";

		int len = line.length();
		int i = 0;
		for(i = 0; i < len; i++){
			char ch = line.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);

			}else {
				ch = Character.toLowerCase(ch);
			}

			ans = String.valueOf(ch);
			System.out.printf("%s",ans);
		}
		System.out.println("");

		sc.close();
	}
}

