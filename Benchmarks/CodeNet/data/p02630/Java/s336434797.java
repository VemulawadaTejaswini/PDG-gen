import java.util.*;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    
	   	int n = scan.nextInt();
		int ar[] = new int[n];
		
		for(int i=0; i<n; i++) ar[i] = scan.nextInt();
		
		int q = scan.nextInt();
		
		for(int i=0; i<q; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
				for(int j=0; j<n; j++) {
					if(ar[j] == b)
						ar[j] = c;
				}
				int sum = 0;
				for(int j=0; j<n; j++) sum += ar[j];
				System.out.print(sum + " ");
		}
      
    }
}