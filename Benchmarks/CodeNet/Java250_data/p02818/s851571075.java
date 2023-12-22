import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long k = stdIn.nextLong();
		
		if(a >=k) {
			System.out.println((a-k)+" "+b);
		}else if((a+b) <= k) {
			System.out.println(0+" "+0);
		}else{
			System.out.println(0+" "+(b-(k-a)));
		}
		
		
		
		
		
		
		
	}

}
