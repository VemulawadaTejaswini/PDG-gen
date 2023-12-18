import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[]x = new double[n];
    String[]y = new String[n];
 
    for(int i=0; i<n; i++) {
    	x[i] = sc.nextDouble();
    	y[i] = sc.next();
    }
    double all = 0;
    for(int i=0; i<n; i++) {
    	if(y[i].equals ("BTC")) {
    		all += x[i]*380000.0;
    	}else {
    		all += x[i];
    	}
    }
    System.out.println(all);
      }
}
