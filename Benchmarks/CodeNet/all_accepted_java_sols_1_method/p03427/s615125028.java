import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	long input =0;
    	ArrayList<Integer> digits = new ArrayList<Integer>();
    	
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            input = Long.parseLong(br.readLine());
        }
        
        int pow = String.valueOf(input).length();
        long currentval = input;
        for (int i=pow-1; i>=0; i--) {
        	int digit =  (int) (currentval/(long)Math.pow(10, i)) ;
        	digits.add(digit);
        	currentval = currentval - digit*(long)Math.pow(10, i);
        }
        
        ArrayList<Integer> candidates = new ArrayList<Integer>();
        int cand=0;
        for(int e:digits) {
        	cand=cand+e;
        }
        candidates.add(cand);
        for(int i = 0; i<pow; i++) {
        	cand =0;
        	if (digits.get(pow-i-1) !=0) {
	        	for(int j = 0; j<i; j++) {
	        		cand=cand+9;
	            	//System.out.println(String.format("add %d",9));
	        	}
	        	for(int j=i; j<pow ;j++) {
	        		cand = cand +digits.get(pow-j-1);
	        		//System.out.println(String.format("add %d",digits.get(pow-j-1)));
	        	}
	        	cand = cand -1;
        	}
        	candidates.add(cand);
        	//System.out.println(cand);
        }
        int maxcand = 0;
        for(int i=0; i<candidates.size();i++) {
        	if(maxcand<candidates.get(i)) maxcand = candidates.get(i);
        }
        System.out.println(maxcand);
    }
}