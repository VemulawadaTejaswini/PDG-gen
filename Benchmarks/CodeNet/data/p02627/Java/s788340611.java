import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		String str;
		str = sc.next();
		c = str.charAt(0);
		if((c >= 'a')&&(c <= 'z')){
			System.out.println("a");
		}else if((c >= 'A')&&(c <= 'Z')) {
			System.out.println("A");
		}
		
		sc.close();

	}

}