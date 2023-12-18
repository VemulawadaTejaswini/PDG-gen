import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] x = new int[n];
      	int[] y = new int[n];
		for(int i=0; i<n; i++){
			x[i] = scn.nextInt();
          	y[i] = scn.nextInt();
		}
      	double nnn = 1;
      	for(int i=1; i<=n; i++){
          nnn*=i;
        }
      	double way=0;
      	for(int i=1; i<n; i++){
          way+=i;
        }
      	double count = nnn*(n-1)/way;
    	double ave = 0;
		for(int i=0; i<n; i++){
      		for(int j=i+1; j<n; j++){
         		ave+=(Math.sqrt(Math.pow(Math.abs(x[i]-x[j]),2)+Math.pow(Math.abs(y[i]-y[j]),2)))/nnn;
     		 }
    	}
    	ave*=count;
    	System.out.println(ave);
      	
	}
}
