import java.util.Scanner;
public class Main {

	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		while(in.hasNextInt()) {
			int i = in.nextInt();
			
			if(i == 2 || i == 3) {
				count++;
				
			}
			
			else if (i % 2 == 0 || i % 3 == 0) {
			}
			
			else {
			
				for(int j = 1; j * j <= i; j++) {
					
					if((i % j == 0) || (i % (j + 2) == 0)) {
					
					}else {
							count++;
							j += 6;
						}
						
						
				}
			
		
			}
		}
		System.out.println(count);
		}
		
		
	}
