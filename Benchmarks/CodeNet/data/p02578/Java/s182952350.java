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
	for(int i=1; i<N; i++){
	    a[i]=sc.nextInt();
	    b[i]=a[i];
	    if(b[i]<b[i-1]){
		b[i]=b[i-1];
	    }
	}
	int a_sum=IntStream.of(a).sum();
	int b_sum=IntStream.of(a).sum();
	System.out.println(b_sum-a_sum);
	
    }
}
