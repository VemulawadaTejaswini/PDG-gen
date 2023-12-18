import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		if(X >= 30 && X <= 40)
		System.out.println("Yes");
		if(X >= -40 && X <= 29)
		System.out.println("No");
	}
}