import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt(),n=sc.nextInt();
		if(n == 100)n++;
		System.out.println((int)Math.pow(100, d)*n);
	}
}
