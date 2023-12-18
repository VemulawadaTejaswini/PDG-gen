import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double x;
		String u;
		Double sum = 0.0;
		for(int i = 0;i < n;i ++) {
			x = sc.nextDouble();
			u = sc.next();
			if(u.equals("JPY")) sum += x;/*JPY.add(x);*/ 
			else sum += x * 380000; //BTC.add(x);
		}
		System.out.println(sum);
	}
}