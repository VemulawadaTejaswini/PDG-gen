import java.util.Scanner;

public class Main {
	
	public static int Pm(int[] A) {
		
		int count = 0;
		
		for(int i=0;i<A.length;i++) {
			boolean NumberF = true;
			for(int j=2;j<= Math.sqrt(A[i]);j++) {
				
				if(A[i] < 2) {
					NumberF = false;
					break;
				}else if(A[i] == 2) {
					break;
				}else if(A[i] % 2 == 0) {
					NumberF = false;
					break;
				}
				
				if(A[i] % j == 0) {
					NumberF = false;
					break;
				}
				
			}
			
			if(NumberF) count++;
		}
		
		return count;
		
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	int[] box = new int[n];
    	
    	for(int i=0;i<n;i++) {
    		box[i] = sc.nextInt();
    	}
    	
    	System.out.println(Pm(box));
    	
    }
}
