import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a = 'a';
		for(int i = 0; i < 26; i++) {
			if(s.indexOf(String.valueOf(a)) == -1) break;
			a++;
		}
		System.out.println((a <= 'z')? a : "None");
	}
}
