import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String[] strs = str.split("");

		int five = 0;
		int seven = 0;

		for(String s: strs) {
			if(s.equals("5")) {
				five += 1;
			}else if(s.equals("7")) {
				seven += 1;
			}
		}

		if(five == 2 && seven == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

		scanner.close();
	}
}