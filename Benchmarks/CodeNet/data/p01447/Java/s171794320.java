import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int N= Integer.parseInt( br.readLine() );
    	int Nmemo= N/2 +1;
    	int[] cnt= new int[Nmemo];
    	cnt[0]= cnt[1]= 0;
    	
    	for(int i=2;i<Nmemo;i++){
    		int min= i;
    		for(int j= i/3;j<= i/2; j++){
    			if( min > cnt[j]+ 1 +cnt[i-2*j] ){
    				min= cnt[j]+ 1 +cnt[i-2*j];
    			}
    		}
    		cnt[i]= min;
    	}
    	int min= N;
		for(int j= (N+1)/3;j<= N/2; j++){
			if( min > cnt[j]+ 1 +cnt[N-2*j] ){
				min= cnt[j]+ 1 +cnt[N-2*j];
			}
		}
		System.out.println(min);
    }
}