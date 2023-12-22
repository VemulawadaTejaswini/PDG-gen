import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double c = 100000;
		for(int i = 0; i < n; i++) {
			c += c*0.05;
			if(c % 1000 != 0) {
				c -= c % 1000;
				c += 1000;
			}
			
		}
		System.out.printf("%.0f\n",c);
	}
}