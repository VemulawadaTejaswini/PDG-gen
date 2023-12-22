import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String p = scanner.nextLine();	//vanceknowledgetoad
		String _p = p+p;				//vanceknowledgetoadvanceknowledgetoad
		String s = scanner.nextLine();	//advance
		if (_p.contains(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}
}
