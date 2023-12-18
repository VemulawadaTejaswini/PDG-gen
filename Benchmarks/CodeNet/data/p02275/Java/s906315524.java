import java.io.*;
import java.util.*;
class Main{
    public static int[] A;
    public static int[] B;
    public static int[] C;
    public static String[] strs;
    public static int n;
    public static void main(String[] args) throws IOException {
	int i,k=0;
	A = new int[2000001];
	B = new int[2000001];
	C = new int[2000001];
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	String str;
	strs = new String[10001];
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	str = buffer.readLine();
	strs = str.split(" ");
	if(strs != null){
	for(i=0;i<n;i++){
	    A[i] = Integer.parseInt(strs[i]);
	    if(k<=A[i]){k = A[i];}
	}
	}
    CountingSort(A,B,k);
    
    for(i=1;i<=n;i++){
	if(i==n){System.out.println(B[i]);break;}
	    System.out.print(B[i]+" ");
    }
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

