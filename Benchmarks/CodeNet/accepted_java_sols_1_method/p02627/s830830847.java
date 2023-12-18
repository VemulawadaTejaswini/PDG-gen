import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String S=scanner.nextLine();
		String result="a";
		if(Character.isUpperCase(S.charAt(0))) {
			result="A";
		}
		System.out.println(result);
	}
}