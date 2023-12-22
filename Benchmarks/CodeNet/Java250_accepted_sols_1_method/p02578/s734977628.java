import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
    	Scanner sn = new Scanner(System.in);
      	int n = sn.nextInt();
      	int x[] = new int[n];
      	for(int i = 0; i < n; i++) {
        	x[i] = sn.nextInt();
        }
      	Long res = 0L;
      	int max = x[0];
      	for(int i = 1; i < n; i++) {
        	if( max > x[i]) {
            	res = res + max - x[i]; 
            } else {
            	max = x[i];
            }
        }
      	System.out.println(res);
    }
}