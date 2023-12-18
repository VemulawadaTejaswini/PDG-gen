import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int tot= sc.nextInt();
    	int Ncoin= sc.nextInt();
    	int[] coin= new int[Ncoin];
    	int[] min= new int[tot+1];
    	for(int i=0;i<Ncoin;i++){
    		coin[i]= sc.nextInt();
    	}
    	for(int i=1;i<=tot;i++){
    		min[i]= -1;
    	}
    	Queue<Integer> query= new LinkedList<Integer>();
    	query.add(0);
    	while( min[tot]<0 ){
    		int rep= query.size();
    		for(int i=0;i<rep;i++){
    			int q= query.remove();
    			for(int j=0;j<Ncoin;j++){
    				if( q+coin[j]<=tot && min[ q+coin[j] ]<0 ){
    					min[ q+coin[j] ]= min[q]+1;
    					query.add(q+coin[j]);
    				}
    			}
    		}
    	}
		System.out.println(min[tot]);
    }
}