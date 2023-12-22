import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		int ans = 0;
		for(;;){
			C = C - B;
			A = A - D;
			if(C <= 0){
				ans = 0;
				break;
			}
			else if(A <= 0){
				ans = 1;
				break;
			}
		}
		if(ans == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");		}
		stdIn.close();
	}
}