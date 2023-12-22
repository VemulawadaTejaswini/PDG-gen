import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long three = N/3*(N/3+1)/2*3;
		long five = N/5*(N/5+1)/2*5;
		long fifteen = N/15*(N/15+1)/2*15;
		System.out.println(N*(N+1)/2-three-five+fifteen);
	}

}