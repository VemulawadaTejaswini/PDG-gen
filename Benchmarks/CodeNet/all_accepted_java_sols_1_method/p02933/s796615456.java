import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		if(n<3200) System.out.println("red");
		else System.out.println(s);

	}

}
