import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		n = n.replaceAll("1","a");
		n = n.replaceAll("9","1");
		n = n.replaceAll("a","9");
		System.out.println(n);
	}

}