import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int energy,y,z,conse;
	int barrier,maxb;
	try{
	    while(0!=(conse=Integer.valueOf(br.readLine()))){
		maxb = 1000000;
		if(!(Math.pow(z=(int)Math.cbrt(conse),3.0)<=conse&&z>1.0))z = 0;
		do{
		    barrier = z;
		    energy = conse-(z*z*z);
		    if(Math.pow(y=(int)Math.sqrt(energy),2.0)<=energy&&y>1.0){
			energy-=(y*y);
			barrier += y;
		    }else y = 0;
		    barrier += energy;
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