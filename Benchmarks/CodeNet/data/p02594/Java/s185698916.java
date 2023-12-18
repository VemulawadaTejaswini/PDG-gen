import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		if(X >= 30 && 40 <= X)
		System.out.println("YES");
		else if(X >= -40 && X < 30)
		System.out.println("NO");
	}
}