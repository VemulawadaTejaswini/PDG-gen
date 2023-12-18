import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int sum=0;
		if(a>b) {
			sum += a;
			a--;
		}else {
			sum += b;
			b--;
		}
		
		if(a>b) {
			sum += a;
			a--;
		}else {
			sum += b;
			b--;
		}
		
		System.out.println(sum);
	}
}
