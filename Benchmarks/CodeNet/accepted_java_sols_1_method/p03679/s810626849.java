import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a>=b)System.out.println("delicious");
		else if(x-(b-a)>=0)System.out.println("safe");
		else System.out.println("dangerous");
	}
}