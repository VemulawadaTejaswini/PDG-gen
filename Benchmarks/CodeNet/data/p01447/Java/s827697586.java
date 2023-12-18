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
    	
    	int cnt= min.size();
    	for(int i=3;i<=N;i++){
    		boolean is_min= true;
    		for(int j=i/2;j>0;j--){
    			int ins_j= Collections.binarySearch(min, j);
    			int ins_i_2j= Collections.binarySearch(min, i-2*j);
    			ins_j= (ins_j>=0) ? ins_j : ~ins_j -1;
    			ins_i_2j= (ins_i_2j>=0) ? ins_i_2j : ~ins_i_2j -1;
    			int cnt_worse= (ins_j > ins_i_2j) ? ins_j : ins_i_2j;
    			  			
    			if( cnt_worse +1 < cnt ){
    				is_min= false;
    				break;
    			}
    		}
    		if( is_min ){
    			min.add(i);
    			cnt++;
    			i= 3*(i-1);
    		}
    	}
    	
		System.out.println(cnt -1);
    }
}