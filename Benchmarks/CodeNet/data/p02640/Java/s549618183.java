import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x%2!=0 && y%2==0) System.out.println("Yes");
		else System.out.println("No");
		

	}

}
