import java.io.*;
import java.util.*;

public class Main{

    static int value[];
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());
	value=new int[n+1];
	System.out.println(fib(n));
    }

    static int fib(int i){
	if(value[i]!=0)
	    return value[i];

	if(i<=1)
	    return 1;
	return value[i]=fib(i-1)+fib(i-2);
    }
}

