import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long all = scan.nextLong(), blue = scan.nextLong(), red = scan.nextLong();
		long count = 0;
		
		count = blue * (all / (blue + red));
		
		if(all % (blue + red) <= blue) {
			count += all %(blue + red);
			
		}else {
			count += blue;
			
		}
		
		System.out.println(count);
		
	}
	
}