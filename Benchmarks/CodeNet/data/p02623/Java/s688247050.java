import java.util.*;
public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int ans=0;
	
	int N=sc.nextInt();
	int M=sc.nextInt();
	int K=sc.nextInt();

	int A[]= new int[N];
	int B[]= new int[M];
	long a[]= new long[N+1];
	long b[]= new long[M+1];
	a[0]=0;
	b[0]=0;

	int best[]= new int[N+1];
	
	for(int i=0; i<N; i++){
	    A[i]= sc.nextInt();
	    a[i+1]=a[i]+A[i];
	}
	for(int i=0; i<M; i++){
	    B[i]=sc.nextInt();
	    b[i+1]=b[i]+B[i];
	}

	int j=M;
	for(int i =0; i<N+1; i++){
	    if(a[i]>K){
		break;
	    }
	   long dif=K-a[i];
	    while(dif<b[j]){
		j=j-1;
	    }
	    ans=Math.max(ans,i+j);
	}
	System.out.println(ans);
	
    }
}

