import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String firstString = sc.next();
		StringBuilder secondStringBld = new StringBuilder(sc.next());
		sc.close();

		if(secondStringBld.indexOf(firstString) == 0 && (secondStringBld.length() - firstString.length()) == 1 ) {
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}

	}

}
