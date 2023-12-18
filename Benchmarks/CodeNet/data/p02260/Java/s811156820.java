import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i=0;
	int tmp;
	int[] A;
	int Count_Sort = 0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String N_str = br.readLine();
	String A_str = br.readLine();


	int N = Integer.parseInt(N_str);
	Scanner sc = new Scanner(A_str).useDelimiter("//s* //s*");
	
	A = new int[N];

	while(sc.hasNext()){
	    A[i] = sc.nextInt();
	    i++;
	}

	for(i=0;i<N-1;i++){
	    int minj = i;
	    for(j=i;j<N-1;j++){
		if(A[j]<A[minj]){
		    minj = j;
		    Count_Sort++;
		}
	    }
	    tmp = A[i];
	    A[i] = A[minj];
	    A[minj] = temp;
	}
	    

	for(i=0;i<N;i++){
	    Syhstem.out.print(A[i]);
	    if(i!=N) System.out.print(" ");
	}
	System.out.println("");
	System.out.println(Count_Sort);
    }
}

