import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());
	String str[]=br.readLine().split(" ");
	int a[]=new int[n];
	
	for(int i=0;i<n;i++){
	    a[i]=Integer.parseInt(str[i]);
	}

	int q=partition(a,0,n-1);

	for(int i=0;i<n;i++){
	    if(i!=0)
		System.out.print(" ");
	    if(i==q)
		System.out.print("[");
	    System.out.print(a[i]);
	    if(i==q)
		System.out.print("]");
	}
	System.out.println();
    }
    static int partition(int A[], int p, int r){
	int x = A[r];
	int i = p-1;
	for (int j = p;j<r;j++){
	    if (A[j] <= x){
		i = i+1;
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	    }
	}
	int temp=A[i+1];
	A[i+1]=A[r];
	A[r]=temp;
	return i+1;
    }
}

