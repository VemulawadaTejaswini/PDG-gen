import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	final int L= 20;
    	final int S= 19;
    	final int[] DAY_YEAR     ={ L,S,L,S,L,S,L,S,L,S };
//    	final int[] DAY_LEAP_YEAR={ L,L,L,L,L,L,L,L,L,L };
    	final int DAYS_YEAR= 5*(L+S);
    	final int DAYS_LEAP_YEAR= 10*L;
    	final int NUM_MILL= (999- 999/3)*DAYS_YEAR+ 999/3*DAYS_LEAP_YEAR+ 1;
    	
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int N= Integer.parseInt( br.readLine() );
    	int year,month,day;
    	int num_tot,num_prev_year,num_this_year;
    	for(int i=0;i<N;i++){
    		String[] buf= br.readLine().split(" ");
    		year = Integer.parseInt(buf[0]);
    		month= Integer.parseInt(buf[1]);
    		day  = Integer.parseInt(buf[2]);
    		
    		num_prev_year  =(year-1- (year-1)/3)*DAYS_YEAR+ (year-1)/3*DAYS_LEAP_YEAR;
    		if( year%3==0 ){
    			num_this_year= (month-1)*L+ day;
    		} else{
    			num_this_year= 0;
    			for(int j=0;j<month-1;j++){
    				num_this_year+= DAY_YEAR[j];
    			}
    			num_this_year+= day;
    		}
    		num_tot= num_prev_year + num_this_year;
    		System.out.println(NUM_MILL-num_tot);
    	}
    }
}