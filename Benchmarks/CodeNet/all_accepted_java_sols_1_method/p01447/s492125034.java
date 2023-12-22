import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	long N= Integer.parseInt( br.readLine() );
//    	ArrayList<Integer>  min= new ArrayList<Integer>();
//    	//min.get(i): minimum amount that needs for i measurements
//    	min.add(0);
//    	min.add(2);
    	
    	int cnt= 1;
    	long tmp_min= 2;
    	while( tmp_min<=N ){
    		tmp_min= 3*(tmp_min-1)+1;
    		cnt++;
    	}
    	cnt--;
    	
		System.out.println( cnt );
    }
}