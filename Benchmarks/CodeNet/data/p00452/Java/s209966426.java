import java.util.Scanner;
import java.util.Arrays;


class Main{
    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);

	while(true){
	    int n=scn.nextInt(),m=scn.nextInt();
	    int[] p = new int[n+1],sum = new int[(n+1)*(n+2)/2];

	    if(n==0&&m==0) break;

	    for(int i=0; i<n; i++)
		p[i] = scn.nextInt();

	    for(int i=0,cnt=0; i<n+1; i++) for(int j=i; j<n+1; j++)
	       sum[cnt++] = p[i]+p[j];

	    Arrays.sort(sum);

	    int max = 0;
	    loop: for(int i:sum){
		int from=0,to=sum.length-1;
		while(true){
		    int center = (from+to)/2;

		    if(from==to||from+1==to){
			int ttl=0;
			if(i+sum[center]<=m)
			    ttl = i+sum[center];
			else if(center>0)
			    ttl = i+sum[center-1];
			max = (max>ttl)?max:ttl;
			break;
		    }

		    if(i+sum[center]>m)   to = center;
		    else if(i+sum[center]<m) from = center;
		    else{
			max = m;
			break loop;
		    }
		}
	    }
	    

	    System.out.println(max);
	}
    }
}