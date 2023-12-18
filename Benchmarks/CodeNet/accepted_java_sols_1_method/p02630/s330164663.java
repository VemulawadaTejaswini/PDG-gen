

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       HashMap<Integer,Integer> map = new HashMap<>();
       int temp;
       long sum=0;
       for(int i =0; i < n; i++) {
           temp = s.nextInt();
           sum+=temp;
           if(map.containsKey(temp))
                map.put(temp, map.get(temp)+1);
           else {
                map.put(temp,1);
           }
       }
//       System.out.println(map);
       int q = s.nextInt();
       int b,c=0,count=0;
       while(q-->0) {
           b = s.nextInt();
           c = s.nextInt();
           count=0;
           if(map.containsKey(b)) {
               temp = map.get(b);
               map.remove(b);
               sum = sum +temp *(c-b);
               if(map.containsKey(c))
                   temp+= map.get(c);
               map.put(c, temp);
           }
//           System.out.println(map);
           System.out.println(sum);
       }
   }
}
