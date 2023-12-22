import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a= 2*x - y/2;
		int b= y/2 - x;
		if (a+b == x && 2*a+4*b == y && a >= 0 && b>=0){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
		return;
	}

}
