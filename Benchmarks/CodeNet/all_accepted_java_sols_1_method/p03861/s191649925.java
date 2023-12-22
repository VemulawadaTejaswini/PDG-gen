import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long c = 0;
		c = b / x - a / x;
		if(a % x == 0){
				c++;
		}
		System.out.println(c);
	}
}