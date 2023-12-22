import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 int M = sc.nextInt();
		
		 int b = N*(N-1)/2;
		 int c = M*(M-1)/2;
		 
		 int sum = b+ c;
		 System.out.println(sum);
	}
}