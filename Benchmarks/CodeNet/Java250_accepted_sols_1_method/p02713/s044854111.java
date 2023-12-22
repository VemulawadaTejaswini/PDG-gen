

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		
		long result = 0;
		
		long kouyaku = 1;
		
		for(int a = 1; a <= max; a++) {
		
			for(int b = 1; b <= max; b++) {
			
				for(int c= 1; c <= max; c++) {
				
					int ap = a;
					
					int bp = b;
					
					int cp = c;
					
					for(int j= 1; j <= ap && j <= bp && j <= cp; j++) {
							
							if(ap%j == 0 && bp%j ==0 && cp%j == 0) {
								
								kouyaku *= j;
								
								ap /= j;
								
								bp /= j;
								
								cp /= j;
								
								j = 1;
								
							}
							
					}
						
						result += kouyaku;
						
						kouyaku = 1;
						
					}
					
				}
			}
		
						
		
		sc.close();
		
		System.out.println(result);
		
	}
	
}
