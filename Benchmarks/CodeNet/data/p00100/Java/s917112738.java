import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    long n = Long.parseLong(br.readLine());
	    while(n!=0){
	        ArrayList<Long> syain = new ArrayList<Long>();
	        HashMap<Long,Long> syainMap = new HashMap<Long,Long>();
	        for(int i=0;i<n;i++){
	            String[] lines = br.readLine().split(" ");
	            long syainno = Long.parseLong(lines[0]);
	            long price   = Long.parseLong(lines[1]) * Long.parseLong(lines[2]);
	            if(syainMap.containsKey(syainno)){
	                syainMap.put(syainno,price + syainMap.get(syainno));
	            }else{
	                syain.add(syainno);
	                syainMap.put(syainno,price);
	            }
	        }
	        boolean ans = false;
	        for(long s:syain){
	            if(syainMap.get(s)>=1000000){
	                System.out.println(s);
	                ans = true;
	            }
	        }
	        if(!ans){
	            System.out.println("NA");
	        }
	        n = Long.parseLong(br.readLine());
	    }
	}
}