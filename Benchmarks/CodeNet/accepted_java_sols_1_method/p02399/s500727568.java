import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a / b;
		int x = a % b;
		double c = 0; 
		c = (double)a / b;
		System.out.println(d + " " + x + " " + String.format("%.8f", c));
    }
}
