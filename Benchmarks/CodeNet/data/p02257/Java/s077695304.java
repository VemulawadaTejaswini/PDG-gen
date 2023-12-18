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
	 
	for(i=0;i<A.length;i++){
	    String a = br.readLine();
	    A[i] = Integer.parseInt(a);
	}
	
	for(i=0;i<A.length;i++){
	    loop: for(int j=2;j<A[i];j++){	
		if(A[i]%j == 0){
		    Count_Not_Prime++;
		    break loop;
		}
	    }
	}
	
	System.out.println(n - Count_Not_Prime);
	return ;
    }
}

