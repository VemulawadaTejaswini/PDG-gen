import java.io.BufferedReader;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = (a+b+1)/2;
		System.out.println(Math.round(x));
	}
}