import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b=sc.nextLong(), c=sc.nextLong();
		sc.close();
		long temp = c-a-b;
		if(temp>0 && 4*a*b<temp*temp) System.out.println("Yes");
		else System.out.println("No");
	}
}