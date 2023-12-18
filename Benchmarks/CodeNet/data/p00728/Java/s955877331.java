import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	final int SCORE_MAX= 1000;
    	final int SCORE_MIN= 0;
        Scanner scan= new Scanner(System.in);
        int N_tot,N_net;
        int sum,max,min,buf;
        while( (N_tot= scan.nextInt())>0 ){
        	N_net= N_tot-2;
        	sum= 0;
        	max= SCORE_MIN; min= SCORE_MAX;
        	for(int i=0;i<N_tot;i++){
        		buf= scan.nextInt();
        		sum += buf;
        		if( buf>max ){ max=buf; }
        		else if( buf<min ){ min=buf; }
        	}
        	int sum_net= sum- max- min;
        	System.out.println(sum_net/N_net);
        }
    }
}