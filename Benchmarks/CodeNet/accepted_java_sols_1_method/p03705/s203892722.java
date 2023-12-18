
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		long N = io.nextLong();
		long A = io.nextLong();
		long B = io.nextLong();
		long ans = (B*(N-1)+A)-(A*(N-1)+B)+1;
		if(N==1) ans =(A==B)? 1:0 ;
		if(A>B) ans = 0;
		
		System.out.println(ans);
	}
}
