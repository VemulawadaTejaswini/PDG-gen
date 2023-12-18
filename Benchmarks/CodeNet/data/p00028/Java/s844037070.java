import java.util.*;
import java.io.*;

public class Main {
      public static void main(String[] args) throws Exception {
		 
           Scanner input = new Scanner(System.in);
	   ArrayList<Integer> result = new ArrayList<Integer>();
	   HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
           int maxCount = 0;

	    while (input.hasNext()) {
		int number = input.nextInt();
		if(count.containsKey(number)) {
		    count.put(number, count.get(number) + 1);
                    maxCount = Math.max(maxCount, count.get(number) + 1);
		}
                else {
                     count.put(number, 1);
                 }
                 for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
                    if(entry.getValue == maxCount) {
                        result.add(entry.getKey());
                    }
                 } 
             }
            Collections.sort(result);
            for(int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }

	  }
      }