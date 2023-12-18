import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x ^= 1;
		System.out.println(x);
		sc.close();
	}
}

