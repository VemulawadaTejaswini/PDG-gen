import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// get a integer
		int A = sc.nextInt();
		// get two integers separated with half-width break
		int B = sc.nextInt();

		if ((B % A) == 0)
			System.out.println(A+B);
		else 
			System.out.println(B-A);
	}

}