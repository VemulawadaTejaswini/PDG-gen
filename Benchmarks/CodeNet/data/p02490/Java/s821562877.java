import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner in = new Scanner(System.in);
			String str1 = in.next();
			String str2 = in.next();
			if(java.lang.Integer.parseInt(str1) == 0 && java.lang.Integer.parseInt(str2) == 0) break;
			if(str1.compareTo(str2) <= 0)
				System.out.println(str1 + " " + str2);
			else
				System.out.println(str2 + " " + str1);
		}
	}
}