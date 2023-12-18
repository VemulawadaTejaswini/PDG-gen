import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i=0;
	int Count_Not_Prime = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str_A = br.readLine();
	
	int n = Integer.parseInt(str_A);
	
	int A[];
	A = new int[n];

	Scanner sc = new Scanner(System.in);
	
	for(i=0;i<A.length;i++){
	    A[i] = sc.nextInt();
	    sc.reset();
	}
	
	for(i=0;i<n-1;i++){
	    loop: for(int j=2;j<A[i];j++){	
		if(A[i]%j == 0){
		    Count_Not_Prime++;
		    break loop;
		}
	    }
	}
	
	System.out.println(n - Count_Not_Prime);
	System.out.println("");
	sc.close();
	return ;
    }
}

