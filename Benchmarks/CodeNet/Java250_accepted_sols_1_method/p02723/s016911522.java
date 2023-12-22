import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		//3文字目と4文字目が等しい
		if(str.charAt(2) == str.charAt(3)) {
			if(str.charAt(4) == str.charAt(5)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
	}
}