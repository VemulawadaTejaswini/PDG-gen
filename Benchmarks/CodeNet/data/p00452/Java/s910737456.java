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
	    for(int i:sum)
	    for(int j=0; j<sum.length; j++)
		if(i+sum[j]>m){
		    if(j>0) max = (max>i+sum[j-1])?max:(i+sum[j-1]);
		    break;
		}

	    System.out.println(max);
	}
    }
}