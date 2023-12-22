import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int N= Integer.parseInt( br.readLine() );
    	ArrayList<Integer>  min= new ArrayList<Integer>();
    	//min.get(i): minimum amount that needs for i measurements
    	min.add(0);
    	min.add(2);
    	
    	int tmp_min= 2;
    	int size_worse;
    	for(int i=3;i<=N;i++){
    		if( i%3==0 ){
    			size_worse= i/3;
    		} else {
    			size_worse= i/3+1;
    		}		
    		if( size_worse >= tmp_min ){
    			min.add(i);
    			tmp_min= i;
    			i= 3*(i-1);
    		}
    	}
    	
		System.out.println( min.size()-1 );
    }
}