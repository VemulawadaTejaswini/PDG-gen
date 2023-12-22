import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	final int PRICE= 100;
    	final double PRECISION= 1.0e3;
    	int num_hrs, win_hrs;
    	double edge;
    	int vote_tot,vote_win;
    	double div;
    	
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	String str;
        while( !( (str= br.readLine()).equals("0 0 0") ) ){
        	String[] buf= str.split(" ");  
        	num_hrs= Integer.parseInt(buf[0]);
            win_hrs= Integer.parseInt(buf[1])-1;
        	   edge= Double.parseDouble(buf[2])/100;
            vote_tot= vote_win= 0;
            for(int i=0;i<num_hrs;i++){
            	if( i==win_hrs ){
            		vote_win= Integer.parseInt(br.readLine());
            		vote_tot+= vote_win;
            	} else{
                	vote_tot+= Integer.parseInt(br.readLine());
            	}
            }
            
            if( vote_win !=0 ){
            	div= (1-edge)*PRICE*vote_tot/vote_win;
            	div= (int)(div*PRECISION +1)/PRECISION;
            	System.out.println((int)Math.floor(div));
            } 
            else{ System.out.println(0); }
        }
    }
}