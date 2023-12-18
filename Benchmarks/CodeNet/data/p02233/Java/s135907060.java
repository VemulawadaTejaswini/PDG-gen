import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(fibonatti(n));
		
	}

	private static int fibonatti(int n) {
		// TODO Auto-generated method stub
		if(n<2) return 1;
		return fibonatti(n-1)+fibonatti(n-2);
	}

}

