import java.util.Scanner;

public class Main {

	public static void Main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		int[] nums = new int[5];
		
		int index = 0;
		
		for(index = 1 ; index <= 5 ; index++) {
			
			int n = s.nextInt();
			
			if(n == 0) {
				System.out.println(index);
				break;
			}
			
			
		}
		
	}

}
