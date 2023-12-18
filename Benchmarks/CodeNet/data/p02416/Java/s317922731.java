import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int sum;
		long xx;
		String x;
		
		do {
			
			
			x = scan.nextLine();
			xx = Long.parseLong(x);
					
			if(xx == 0)break;
			sum = 0;
			
			for(int i = 0; i < x.length(); i++) {
				char c = x.charAt(i);
				sum += (int)c - 48;
			}
			
			System.out.println(sum);
			
		}while(true);
	}
}

