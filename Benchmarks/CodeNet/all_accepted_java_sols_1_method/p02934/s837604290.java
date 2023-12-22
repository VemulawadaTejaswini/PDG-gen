import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	for (int i = 0; i < n; i++){
        	a[i] = scan.nextInt();
        }
      	double bunbo = 0.0;
      	for(int i = 0; i < n; i++){
        bunbo += (double)1 / a[i];
        }
      	System.out.print(1 / bunbo);
    }
}