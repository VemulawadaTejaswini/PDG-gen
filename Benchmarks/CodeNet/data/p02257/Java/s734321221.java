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
			
			else if(i < 25) {
				count++;
			}
			
			else {
			
				for(int j = 5; j * j <= i; j+= 6) {
					
					if((i % j == 0) || (i % (j + 2) == 0)) {
					
					}else {
							count++;
							
						}
						
						
				}
			
		
			}
		}
		System.out.println(count);
		}
		
		
	}
