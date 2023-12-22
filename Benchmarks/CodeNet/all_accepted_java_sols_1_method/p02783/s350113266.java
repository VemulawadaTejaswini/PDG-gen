import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h =sc.nextInt(), a=sc.nextInt();
		if(h%a==0) System.out.println(h/a);
		else System.out.println(h/a+1);
	}
}
