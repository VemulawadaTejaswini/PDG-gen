import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b, c;	
	while(true){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    if((a|b|c)==0)
		break;
	    int[] x = new int[a];
	    
	    for(int i=0; i<a; i+=b){
		x[i]=1;
		if(i+c<a)
		    x[i+c]=1;
		
	    }
	    for(int i=0; i<a; i+=c){
		x[i]=1;
		if(i+b<a)
		    x[i+b]=1;
		
	    }
	    int itung=0;
	    for(int i=0; i<a; i++)
		if(x[i]==0)
		    itung ++;
	    
	    System.out.println(itung);
	}
    }
}