import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	while(true){
	    Scanner sc = new Scanner(System.in);
	    int ip, suma=0, sumb=0;
	    ip = sc.nextInt();
	    if(ip==0)
		break;
	    int[] x = new int[ip];
	    int[] y = new int[ip];
	    for(int i=0; i<ip; i++){
		x[i]=sc.nextInt();
		y[i]=sc.nextInt();
	    }
	    
	    for(int i=0; i<ip-1; i++){
		suma+=x[i]*y[i+1];
		sumb+=x[i+1]*y[i];
	    }
	    suma+=x[ip-1]*y[0];
	    sumb+=x[0]*y[ip-1];
	    System.out.println(Math.abs((double)(suma-sumb)/2.0));
	}
    }
}