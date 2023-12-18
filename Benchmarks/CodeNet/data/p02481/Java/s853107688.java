import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int S,L;
		S = a*b;
		L = 2*a+2*b;
		
		System.out.println(S +" "+ L);
	}

}