import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.lastIndexOf('Z') - s.indexOf('A') + 1);
	}
}