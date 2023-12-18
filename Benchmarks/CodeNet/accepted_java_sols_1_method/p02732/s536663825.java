import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    Map<Long, Long> map = new HashMap<>();
    long[] val = new long[N];
    for(int i = 0; i < N; i++){
      val[i] = Long.parseLong(S[i]);
    }
    for(int i = 0; i < N; i++){
      if(map.containsKey(val[i])){
        map.put(val[i], map.get(val[i])+1);
      }else{
        map.put(val[i],1l);
      }
    }
    
    long ans = 0;
    for(Map.Entry<Long, Long> en : map.entrySet()){
      long b = en.getValue();
      ans += (b*(b-1))/2;
    }
    
    for(int i = 0; i < N; i++){
      long a = map.get(val[i]);
      long b = ((a*(a-1))-((a-1)*(a-2)))/2;
      System.out.println(ans-b);
    }
  }
}