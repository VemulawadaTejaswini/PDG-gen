import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long ans = 0;
		long a = 100;
		for(;;){
			ans++;
			a = a + a/100;
			if(X <= a){
				break;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}