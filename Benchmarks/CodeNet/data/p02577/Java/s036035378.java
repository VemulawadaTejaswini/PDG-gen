import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String N = stdIn.next();
		if(N.length() < 8){
			long A = new Long(N);
			if(A % 9 == 0){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else{
			long sum = 0;
			long a = 0;
			for(int i = 0; i < N.length(); i++){
				a = N.charAt(i);
				sum = sum + a;
			}
			if(sum % 9 == 0){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}


		}
		stdIn.close();
	}
}