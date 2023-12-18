import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int sin[] = new int[5];
		int good = 0;
		
	
		for(int i = 0; i < 5; i++) {
			sin[i] = scan.nextInt();
			if(sin[i] == 0) {
				good = i;
				break;
				
			}
			
		}
		
		System.out.println(good + 1);
		
	}
		
	
}

