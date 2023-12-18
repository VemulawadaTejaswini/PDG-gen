import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		int time = Math.min(d,  b);
		time -= Math.max(a, c);
		
		if(time < 0)time = 0;
		System.out.println(time);
		
	}

}
