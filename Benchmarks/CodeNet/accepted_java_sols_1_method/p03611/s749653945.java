import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer>hm = new HashMap<Integer, Integer>();
    
       int n = sc.nextInt();
       int maxnum = 0;
       int minnum = 0;
     
       int []a = new int [n];
       
       for(int i = 0; i < n ;i++) {
    	   a[i] = sc.nextInt();
       }
       
      
       for(int i = 0 ; i < n ;i++) {
    	   if(hm.get(a[i]) == null) {
    		   hm.put(a[i], 1);
    	   }
    	   else {
    		   hm.put(a[i], hm.get(a[i])+ 1);
    	   }
    	   if(hm.get(a[i]-1) == null) {
    		   hm.put(a[i]-1, 1);
    	   }
    	   else {
    		   hm.put(a[i]-1, hm.get(a[i]-1)+ 1);
    	   }
    	   if(hm.get(a[i]+1) == null) {
    		   hm.put(a[i]+1, 1);
    	   }
    	   else {
    		   hm.put(a[i]+1, hm.get(a[i]+1)+ 1);
    	   }
       }
       
       for(int num : hm.keySet()) {
    	   maxnum = Math.max(hm.get(num), maxnum);
       }
       
       System.out.println(maxnum);
       
       
	}


}
