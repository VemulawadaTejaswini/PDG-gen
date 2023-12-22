import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	int ans=0;
	
        Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int a[]=new int[N];
	int b[]=new int[N];
	a[0]=sc.nextInt();
	b[0]=a[0];
	long a_sum=a[0];
	long b_sum=b[0];
	
	for(int i=1; i<N; i++){
	    a[i]=sc.nextInt();
	    a_sum+=a[i];
	    b[i]=a[i];
	    if(b[i]<b[i-1]){
		b[i]=b[i-1];
	    }
	    b_sum+=b[i];
	}
	
	System.out.println(b_sum-a_sum);
	
    }
}
