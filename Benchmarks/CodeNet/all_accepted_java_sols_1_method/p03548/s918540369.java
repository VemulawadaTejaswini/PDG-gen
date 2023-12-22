import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		if (X%(Y+Z) >= Z) System.out.println(X/(Y+Z));
		else if (X%(Y+Z) < Z) System.out.println(X/(Y+Z)-1);
		
	}
}
