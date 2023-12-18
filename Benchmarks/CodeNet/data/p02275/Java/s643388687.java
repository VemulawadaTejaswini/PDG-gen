import java.io.*;
import java.util.*;
class Main{
    public static int[] A;
    public static int[] B;
    public static int[] C;
    public static int n;
    public static void main(String[] args) {
	int i,j=0,k=0;
	A = new int[2000001];
	B = new int[2000001];
	C = new int[2000001];
	try{
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String str = buffer.readLine();
	    n = Integer.parseInt(str);
	    String strs = buffer.readLine();
	    String[] strss = strs.split(" ");
	    for(i=0;i<n;i++){
		A[i] = Integer.parseInt(strss[j]);
		j++;
		if(k<=A[i]){k = A[i];}
	    }
	}catch(Exception e){
	    System.out.println("error");
	}
	CountingSort(A,B,k);
	StringBuffer sb = new StringBuffer();
	for(i=1;i<n;i++){
	    sb.append(B[i]+" ");
	}
	sb.append(B[i]);
	System.out.println(sb);
    }

    public static void CountingSort(int A[],int B[],int k){
	int i,j;
	for(i=0;i<k+1;i++){
	    C[i] = 0;
	}
	for(j=0;j<n;j++){
	    C[A[j]]++;
	}
	for(i=1;i<k+1;i++){
	    C[i] = C[i] + C[i-1];
	}
	for(j=n-1;j>=0;j--){
	    B[C[A[j]]] = A[j];
	    C[A[j]]--;
	}
    }

}

