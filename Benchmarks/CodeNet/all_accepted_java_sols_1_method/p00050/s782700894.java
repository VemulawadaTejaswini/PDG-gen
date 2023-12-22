import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.replace("apple","/");
		str = str.replace("peach","apple");
		str = str.replace("/","peach");
		System.out.println(str);
		sc.close();
		
	}

}