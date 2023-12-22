import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int f1, f2;
		double f3;
		f1 = x / y;
		f2 = x % y;
		f3 = (double)x/(double)y;
		System.out.printf("%d %d %.5f\n", f1, f2, f3);	
     }
}

