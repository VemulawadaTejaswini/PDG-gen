import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
	
		int sum = 0;
		for (int i = 0 ; i < n ; i++) {
			
			sum += Integer.parseInt(sc.next());
			
		}
		
		if(h > sum) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		
	}
	
	
	

}