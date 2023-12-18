import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	int energy,x,y,z,conse;
	int barrier,maxb;
	try{
	    while(0!=(conse=Integer.valueOf(br.readLine()))){
		maxb = 1000000;
		if(Math.pow(z=(int)Math.cbrt(conse),3.0)<=conse&&z>1.0){
		    barrier = z;
		}else {
		    z = 0;
		    barrier = 0;
		}
		do{
		    energy = conse-(z*z*z);
		    if(Math.pow(y=(int)Math.sqrt(energy),2.0)<=energy&&y>1.0){
			energy-=(y*y);
		    }else y = 0;
		    x = energy;
		    barrier = x+y+z;
		    if(barrier<maxb){
			maxb = barrier;
		    }
		    z--;

		}while(z>=0);
		System.out.println(Integer.toString(maxb));

	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}