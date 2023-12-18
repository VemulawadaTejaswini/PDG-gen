import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		int h = 0;
		
		int m = 0;
		
		int s = 0;
		
		if(x >= 3600) {
			h = x / 3600;
			x = x % 3600;
		}
		
		if(x >= 60) {
			m = x / 60;
			s = x % 60;
		}else {
			s = x;
		}
		
		System.out.println(h + ":" + m + ":" + s);
		
		scanner.close();
		
	}

}
