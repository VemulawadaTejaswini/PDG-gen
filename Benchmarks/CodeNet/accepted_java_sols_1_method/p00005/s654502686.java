//import java.util.Arrays;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c;
			long r;
			long A = a;
			long B = b;
				while((r = a%b) != 0){
					a=b;
					b=r;
				}
		
				c = A*B/b;
		
				System.out.println(b + " " + c);
		}
	}
} 