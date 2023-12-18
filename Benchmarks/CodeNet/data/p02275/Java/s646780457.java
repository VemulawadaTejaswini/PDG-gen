import java.io.*;
import java.util.*;

public class Main{

    static int n;
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);

	//n=Integer.parseInt(br.readLine());
	n=scan.nextInt();
	int a[]=new int[n];
	int result[]=new int[n];
	int max=Integer.MIN_VALUE;
	
	//String str[]=br.readLine().split(" ");
	
	for(int i=0;i<n;i++){
	    //a[i]=Integer.parseInt(str[i]);
	    a[i]=scan.nextInt();
	    max=Math.max(max,a[i]);
	}

	CountingSort(a,result,max);

	StringBuilder sb=new StringBuilder();
	sb.append(result[0]);
	for (int i = 1; i < n; i++) {
	    sb.append(' ');
	    sb.append(result[i]);
	}
	System.out.println(sb);
	
    }
    
    
    
    static  void CountingSort(int A[], int B[], int k){
	int[] C = new int[k+1];
	
	/* C[i] に i の出現数を記録する */
	for (int i = 0 ;i<n;i++)
	    C[A[i]]++;
	
	/* C[i] に i 以下の数の出現数を記録する*/
	for (int i = 1;i<=k;i++)
	    C[i] += C[i-1];
	
	for (int i = n - 1; i >= 0; i--) {
	    C[A[i]]--;
	    B[C[A[i]]] = A[i];
	    
	}
    }
}

