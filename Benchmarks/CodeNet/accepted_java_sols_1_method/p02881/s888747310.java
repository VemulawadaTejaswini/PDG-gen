import java.util.Scanner;
public class Main {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		
		
		long step;
		long i;
		for(i=(long) Math.sqrt(n);i>=1;i--) {
			if(n%i==0) {
				step = i + n/i;
				System.out.println(step-2);
				break;
			}
		}
	}
}