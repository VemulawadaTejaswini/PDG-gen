import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   


    public static void main ( String [] args ) throws IOException
    {
	
	int end = Integer.parseInt(br.readLine());
	while(end != 0){
	    new Main().cal(end);
	    end = Integer.parseInt(br.readLine());
	}	
    }

int[] thr;


    private void cal(int end) throws IOException 
    {
	int z = end;
	int limit = z*z*z;
	int tmp;
	int max;

	thr = new int[z];
	for(int i=1; i< z; i++){
		thr[i] = i*i*i;
	}
    	

	max = thr[1] + thr[1];
	for( int i =1; i< z; i++){
		for(int j=1; j< z; j++){
			tmp = thr[i] + thr[j];
			if( tmp <= limit && tmp > max ){
				max = tmp;
			}
			if( tmp >= limit ){
				break;
			}
		}
	}
	
	System.out.println(limit - max);
    }
}