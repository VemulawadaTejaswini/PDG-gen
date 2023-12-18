import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
       public static void main(String arg[]){
    	   HashMap<String,String> map = new HashMap<String,String>();
    	   Scanner in = new Scanner(System.in);
    	   ArrayList<String> al = new ArrayList<String>();
    	   
    	   while(true){
    		   int n = Integer.parseInt(in.nextLine());
    		   
    		   if(n==0){
    			   for(int i=0; i < al.size(); i++){
    				   System.out.println(al.get(i));
    			   }
    			   in.close();
    			   break;
    		   }
    		   
               for(int i=0; i < n; i++){
            	   String[] ct = in.nextLine().split(" ");
            	   map.put(ct[0],ct[1]);
               }
    		
               int m = Integer.parseInt(in.nextLine());
               StringBuilder ans = new StringBuilder();
               for(int i=0; i < m; i++){
            	   String word = in.nextLine();
            	   if(map.containsKey(word)){
            	      char ch = map.get(word).charAt(0);
            	      ans.append(ch);
            	   }else{
            		  char ch = word.charAt(0);
            		  ans.append(ch);
            	   }
               }
               
               al.add(ans.toString());
               
    	   }
       
       }
}