import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kSt = scanner.nextLine();
		int k = Integer.parseInt(kSt);
		String s = "";
		String str = "";
		for(int i = 0; i < k; i++){
			s = scanner.nextLine();
			str = s.replace("Hoshino", "Hoshina");
			System.out.println(str);
		}
	}
}