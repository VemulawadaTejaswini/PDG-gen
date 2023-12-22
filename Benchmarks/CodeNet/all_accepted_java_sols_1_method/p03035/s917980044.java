import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());

		int B = Integer.parseInt(sc.next());

		if(A>12) {
			System.out.println(B);
		}else if(A>5){
			System.out.println(B/2);
		}else{
			System.out.println(0);
		}


		
	}
}