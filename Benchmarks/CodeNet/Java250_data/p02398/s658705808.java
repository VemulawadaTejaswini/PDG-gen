import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int divisor = 0;
		for(int i = 0 ; i <= (b-a) ; i++) {
			if(c%(a+i) == 0) {
				 divisor += 1; 
			}
		}
		System.out.println(divisor);
		 
		sc.close();
	}

}