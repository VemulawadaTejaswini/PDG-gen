import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  
  	private final static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      TreeMap<Long ,Long > map = new TreeMap<Long,Long>();
      for(int i = 0; i < N; i++) {
    	 long Ai = sc.nextLong();
    	 if(map.containsKey(Ai)) {
    		 map.replace(Ai, map.get(Ai) +1);
    	 } else {
    		 map.put(Ai,1l);
    	 } 
      }
      for(int i = 0; i < M; i++) {
    	  long key = map.lastKey();
    	  long value = map.get(key);
    	  if(value == 1) {
    		  map.remove(key);
    	  } else {
    		  map.replace(key, value-1);
    	  }
    	  key = key/2;
    	  if(map.containsKey(key)) {
    		  map.replace(key, map.get(key)+1);
    	  } else {
    		  map.put(key, 1l);
    	  }
      }
      long sum = 0;
      for(long key : map.keySet()) {
    	  sum += key * map.get(key);
      }
      System.out.println(sum);    
      
   }
}