import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if(C>=A && C<=B){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}
