import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N%2 == 0) {
			System.out.println(N);
		} else {
			System.out.println(2*N);
		}
		
	}

}