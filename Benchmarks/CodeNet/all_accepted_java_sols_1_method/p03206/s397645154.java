import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d=scan.nextInt();
		if(d==25) System.out.println("Christmas");
		else if (d==24 )System.out.println("Christmas Eve");
		else if(d==23) System.out.println("Christmas Eve Eve");
		else System.out.println("Christmas Eve Eve Eve");
	}

}
