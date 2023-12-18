import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]){
	int i,n=0,fn;
	try{
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String str = buffer.readLine();
	    n = Integer.parseInt(str);
	}catch(Exception e){
	    System.out.println("error");
	}
	fn = fib(n);
	System.out.println(fn);
    }

    static int fib(int n){
	int f1,f2,f3,i;
	if(n==0 || n==1){
	    return 1;
	}
	else{
	    f1=1;
	    f2=1;
	    for(i=2;i<=n;i++){
		f3 = f2;
		f2 = f1;
		f1 = f2+f3;
	    }
	    return f1;
	}
    }
}

