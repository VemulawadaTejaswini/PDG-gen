
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int p = stdIn.nextInt();
		int t = stdIn.nextInt();
		int t1 = stdIn.nextInt();
		
		if(p > t){
			p = t;
		}
		if(p > t1) {
			p = t1;
		}
		
		int j1 = stdIn.nextInt();
		int j2 = stdIn.nextInt();
		if(j1 > j2) {
			j1 = j2;
		}
		
		p += j1;
		p -= 50;
		System.out.println(p);
	}
}