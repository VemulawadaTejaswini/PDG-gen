import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 char[] cc = str.toCharArray();
		 char x = (char) (cc[0]+1);
		 System.out.println(x);
	}
}