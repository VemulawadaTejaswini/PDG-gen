import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			
			
			boolean isRain = false;
			int duration = 0;
			for(int i = 0 ; i < s.length() ; i++ ) {
				
				if ( s.charAt(i) == 'R') {
					if ( isRain) {
						duration++;
					}
					else {
						duration = 1;
					}
					isRain = true;
				}
				else {
					isRain = false;
				}
								
			}
			
			System.out.println(duration);
		}
	}

}