
import java.util.*;

public class Main {

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	double[] a= new double[n];
	double ave =0;
	
	for (int i=0; i<n; i++){
		a[i]=n*sc.nextInt();
		ave=ave+a[i]/n;
	}
	
	int ans = 0;
	double dist = 100000;
	
	for (int i=0; i<n; i++){
		double k =Math.abs(ave-a[i]);
		if(dist>k){
			dist=k;
			ans=i;
		}
		if(dist==k){
			if(ans>i){
				ans=i;
			}
		}
		
	}
	
	System.out.println(ans);
}
}
