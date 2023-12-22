import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, a, b;
		
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		int min = Math.abs(x - a);
		int tmp = Math.abs(x - b);
		if(min < tmp)System.out.println("A");
		else System.out.println("B");
		
	}

}
