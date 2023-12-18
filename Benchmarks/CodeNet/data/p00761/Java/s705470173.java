import java.io.*;
import java.util.*;

public class Main{
	private static void solve(int q,int digit) {
    	ArrayList<Integer> memo= new ArrayList<Integer>();
    	char[] num= new char[digit];
    	
    	Integer tmp= q;
    	Integer next= q;
		do{
			tmp= next;
			memo.add(tmp);
			
			String buf= tmp.toString();
	    	Arrays.fill(num,'0');
			for(int i=0;i<buf.length();i++){
				num[i]= buf.charAt(i);
			}
			Arrays.sort(num);

			StringBuilder sb_min= new StringBuilder().append(num);
			StringBuilder sb_max= new StringBuilder().append(num).reverse();
			Integer int_min= Integer.valueOf(sb_min.toString());
			Integer int_max= Integer.valueOf(sb_max.toString());
			next= int_max-int_min;
		} while( !memo.contains(next) );
		
		int idx= memo.indexOf(next);
		System.out.println(idx+" "+next+" "+(memo.size()-idx));
	}
	
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int q,digit;
    	while(true){
    		q= sc.nextInt();
    		digit= sc.nextInt();
    		if( q!=0 || digit!=0 ){
    			solve(q,digit);
    		} else{ break; }
    	}
    }
}