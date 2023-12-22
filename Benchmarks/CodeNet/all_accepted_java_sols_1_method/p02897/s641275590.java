import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			double p =(double) 1/2;
			System.out.println(p);
		}
		else {
			double q = (double)(n + 1)/(n * 2);
			System.out.println(q);
		}

	}

}
