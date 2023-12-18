import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    while(n!=0){
	        ArrayList<Integer> syain = new ArrayList<Integer>();
	        HashMap<Integer,Integer> syainMap = new HashMap<Integer,Integer>();
	        for(int i=0;i<n;i++){
	            String[] lines = br.readLine().split(" ");
	            int syainno = Integer.parseInt(lines[0]);
	            int price   = Integer.parseInt(lines[1]) * Integer.parseInt(lines[2]);
	            if(syainMap.containsKey(syainno)){
	                syainMap.put(syainno,price + syainMap.get(syainno));
	            }else{
	                syain.add(syainno);
	                syainMap.put(syainno,price);
	            }
	        }
	        boolean ans = false;
	        for(int s:syain){
	            if((int)syainMap.get(s)>=1000000){
	                System.out.println(s);
	                ans = true;
	            }
	        }
	        if(!ans){
	            System.out.println("NA");
	        }
	        n = Integer.parseInt(br.readLine());
	    }
	}
}