import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int A = stdIn.nextInt();
		int ans = 0;
		if(H % A == 0){
			ans = H / A;
		}
		else{
			ans = H / A;
			ans = ans + 1;
		}
		System.out.println(ans);
		stdIn.close();
	}
}
