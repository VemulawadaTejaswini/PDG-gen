import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		boolean ans = A<C && C<B || B<C && C<A;


		if(ans){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}


	}


}
