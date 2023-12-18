import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int area, lap;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		area = a * b;
		lap = 2 * (a + b);
		
		System.out.println(area);
		System.out.println(lap);
	}

}