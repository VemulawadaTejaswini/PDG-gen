import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]){
	int i,n=0;
	int A[] = new int[250];
	try{
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String str = buffer.readLine();
	    n = Integer.parseInt(str);
	    StringTokenizer st = new StringTokenizer(buffer.readLine());
	    for(i=1;i<=n;i++){
		A[i] = Integer.parseInt(st.nextToken());
	    }
	}catch(Exception e){
	    System.out.println("error");
	}
	
	for(i=1;i<=n;i++){
	    System.out.print("node "+i+": ");
	    System.out.print("key = "+A[i]+", ");
	    if((i/2)!=0){
		System.out.print("parent key = "+A[i/2]+", ");
	    }
	    if((2*i) <= n){
		System.out.print("left key = "+A[2*i]+", ");
	    }
	    if(2*i+1 <= n){
		System.out.print("right key = "+A[2*i+1]+", ");	
	    }
	    System.out.println("");
	}
    }
}


