import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a - b <= 1 && b - a <= 1) System.out.println("Yay!");
		else System.out.println(":(");
	}
}
