
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(),A= sc.nextLong(),B= sc.nextLong();
		long wa =A+B;
		if(wa==0) {
			System.out.println(0);
		}else {
			long ans = (N/wa)*A;
			if (N%wa<=A) {
				ans+= N%wa;
			}else{
				ans+= A;
			}
			System.out.println(ans);
		}
	}

}