import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long X = scan.nextLong();
			long Y = scan.nextLong();
			
			long point = X;
			int count = 1;
			
			while(true) {
				point*=2;
				if(point<=Y) {
					count++;
				}else{
					break;
				}
			}
			
			System.out.println(count);
			
			
			
		}
	}
}
