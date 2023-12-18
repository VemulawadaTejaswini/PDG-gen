package firstone;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner (System.in);
System.out.println("enter a = ");
a = sc.nextInt();
System.out.println(a + Math.pow(a, 2) + Math.pow(a, 3) );
	}

}
