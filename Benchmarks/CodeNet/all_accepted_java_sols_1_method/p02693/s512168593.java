import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans = 0;

		for(int a = A; a <= B ; a++){
			if(a % K == 0){
				ans = 1;
				break;
			}
		}
		if(ans == 1){
			System.out.println("OK");
		}
		else{
			System.out.println("NG");
		}
		stdIn.close();
	}
}