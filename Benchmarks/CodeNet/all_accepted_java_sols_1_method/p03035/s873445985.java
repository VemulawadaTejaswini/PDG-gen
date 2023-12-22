import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		
		int c = 0;
		if(A>=13) {
			c = B;
		}else if(A>=6) {
			c = B/2;
		}else {
			c = 0;
		}
		
		System.out.println(c);
		
		sc.close();
		
	}

}