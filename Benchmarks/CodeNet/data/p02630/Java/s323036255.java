import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    Map<Integer,Integer> map = new HashMap<>();
    
    long sum = 0;
    for(int i=0;i<n;i++){
      int num = sc.nextInt();
      map.put(num,map.getOrDefault(num,0)+1);
      sum+=num;
    }
    
    int q = sc.nextInt();
    
    for(int i=0;i<q;i++){
      int from = sc.nextInt();
      int to = sc.nextInt();
      
      if(map.containsKey(from)){
        map.put(to, map.getOrDefault(to,0)+map.get(from));
      
        sum = sum - from*map.get(from) + to*map.get(from);
        map.remove(from);
        System.out.println(sum);
      } else {
        System.out.println(sum);
      }
    }
  }
}


/*
4
1 2 3 4
3
1 2
3 4
2 4
*/