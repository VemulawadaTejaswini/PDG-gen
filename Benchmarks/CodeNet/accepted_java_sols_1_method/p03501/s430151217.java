import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int plana = n * a;
		if( plana>=b )
		{
			System.out.println(b);
		}
		else if( plana<b )
		{
			System.out.println(plana);
		}
	}
}