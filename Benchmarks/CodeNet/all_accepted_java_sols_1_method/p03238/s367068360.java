import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		if(N==1){
			System.out.println("Hello World");
		}else if(N==2){
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A + B);
		}
	}
}
