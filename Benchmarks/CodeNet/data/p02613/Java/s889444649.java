import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      int i;
      map.put("AC",0);
      map.put("WA",0);
      map.put("TLE",0);
      map.put("RE",0);
      for(i=0;i<N;i++)
      {
          String s = sc.next();
          if(map.containsKey(s))
          {
              map.put(s,map.get(s) + 1);
          }
          else
            map.put(s,1);
      }
      for(Map.Entry<String,Integer> e : map.entrySet())
        System.out.println(e.getKey()+" x "+e.getValue());
    }
}