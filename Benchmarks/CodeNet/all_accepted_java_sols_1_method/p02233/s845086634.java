import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] Fib = new int[45];
		Fib[0] = 1;
		Fib[1] = 1;
		
		for(int i=2; i<=n; i++){
			Fib[i] = Fib[i - 1] + Fib[i - 2];
		}
		System.out.println(Fib[n]);
	}
}
