import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long ans = 0;
		for(long a = 1; a <= N; a++){
			if(a % 3 == 0 || a % 5 == 0){
				ans = ans + 0;
			}
			else{
				ans = ans + a;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}