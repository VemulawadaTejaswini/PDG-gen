import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		int z = Integer.valueOf(sc.readLine());
		if(z==0)
		    break;
		int mulz = z*z*z;
		int max = 0;
		for(int i=1; i<z; i++)
		    for(int j=1; j<z; j++){
			int tmp = i*i*i+j*j*j;
			if(tmp<mulz)
			    max = Math.max(max,tmp);
		    }
		System.out.println(mulz-max);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}