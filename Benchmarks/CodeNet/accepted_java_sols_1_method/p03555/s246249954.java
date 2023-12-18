import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		StringBuffer strbRevese = (new StringBuffer(s.nextLine())).reverse();
		String strReverse = strbRevese.toString();
		if (str1.equals(strReverse)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
