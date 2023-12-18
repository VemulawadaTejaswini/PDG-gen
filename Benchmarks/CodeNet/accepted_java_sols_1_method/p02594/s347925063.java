import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Temperature=sc.nextInt();
		sc.close();
		if(Temperature>=30)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
