import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int R, G, B, N;
    		R = sc.nextInt();
    		G = sc.nextInt();
    		B = sc.nextInt();
    		N = sc.nextInt();
    		
    		int counter = 0;
    		
    		for (int redSize = 0; R*redSize <= N; redSize++) {
    			for (int greSize = 0; G*greSize <= N; greSize++){
    				int tmpBuleSize = N - R*redSize - G*greSize;
    				if (0 <= tmpBuleSize && tmpBuleSize % B == 0) {
    					counter++;
    				}
    				
    			}
    		}
    		
    		System.out.println(counter);
    		
    	}
    	
    } 
}