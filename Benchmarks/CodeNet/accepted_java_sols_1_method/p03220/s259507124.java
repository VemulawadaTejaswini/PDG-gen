import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    double[]H = new double[n];
    double[]ans = new double[n];
    
    for(int i=0; i<n; i++) {
    	int h = sc.nextInt();
    	double x = a-(t-h*0.006);
    	x = Math.abs(x);
    	H[i] = x; 
    	ans[i] = x;
    } 	
    Arrays.sort(H);
    for(int i=0; i<n; i++) {
    if(H[0]==ans[i]) {
        	System.out.println(i+1);
      }
}
}
}