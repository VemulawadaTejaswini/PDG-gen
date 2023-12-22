import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		sc.close();
		
		String replacedS = s.replace("ABC", "");
		
		System.out.println((n-replacedS.length())/3);
	}
}
