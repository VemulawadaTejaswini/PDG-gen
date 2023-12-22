import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int divisor = 0;
		for(int a = 0 ; a < N.length(); a++){
			divisor = divisor + Integer.parseInt(N.substring(a, a+1));
		}
		System.out.println(Integer.parseInt(N)%divisor==0?"Yes":"No");
	}
}