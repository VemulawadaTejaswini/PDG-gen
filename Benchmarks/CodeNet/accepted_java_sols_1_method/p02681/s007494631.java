import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = str2.substring(0, str2.length() - 1);
		if(str.equals(str3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
