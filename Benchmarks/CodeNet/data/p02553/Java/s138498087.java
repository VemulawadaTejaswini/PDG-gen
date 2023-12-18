import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b  = sc.nextLong();
		long c  = sc.nextLong();
		long d  = sc.nextLong();
		long temp1 = Math.max(a * c, a * d);
		long temp2 = Math.max(b * c, b * d);
		
		System.out.println(Math.max(temp1, temp2));
		sc.close();
	}
}


