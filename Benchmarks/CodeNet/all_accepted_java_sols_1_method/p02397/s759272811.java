
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) 
				break;
			else {
				int sum = a+b;
				a = Math.min(a,b);
				b = sum-a;
			}
			System.out.println(a+" "+b);
		}
	}
}

