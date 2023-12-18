import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] ar, ss, at;
	int j, k, x, put, alo;
	while(sc.hasNext()){
	    put = 0; alo=0;
	    x = sc.nextInt();
	    ar = new int[x];
	    ss = new int[x];
	    
	    for(j=1; j<x; j++)
		if(ar[j]==0){
		    ss[put]=j+1;
		    put++;
		    for(k=j+1; k<x+1; k+=(j+1))
			ar[k-1]=1;
		}
	    at = new int[x];
	    for(int le=0; ss[le]!=0; le++)
		at[ss[le]-1] = 1;
	    for(int pak=0; pak<x; pak++)
		if(at[pak]==1 && at[x-pak-1]==1)
		    alo++;
	    System.out.println(alo);
	}
    }
}