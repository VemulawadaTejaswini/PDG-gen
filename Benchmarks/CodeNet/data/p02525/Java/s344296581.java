import java.util.*;

public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n;
	    while(true){
	    	n=sc.nextInt();
	    	if(n==0) break;
	    	int[] s = new int[n];
	    	int sum=0;
	    	for(int i=0;i<n;++i){
	    		s[i]=sc.nextInt();
	    		sum+=s[i];
	    	}
	    	double m=(double)sum/n;
	    	double S=0.0;
	    	for(int i=0;i<n;++i){
	    		S+=(double)(s[i]-m)*(s[i]-m);
	    	}
	    	S/=(double)n;
	    	System.out.printf("%.8f\n",Math.sqrt(S));
	    }
	}
}