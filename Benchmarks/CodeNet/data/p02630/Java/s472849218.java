import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    // Long A[] = new Long[N];
    HashMap<Long,Integer> map = new HashMap<Long,Integer>();
    Long sum = 0L;
    for(int i=0;i<N;i++){
      Long tmp = sc.nextLong();
      sum += tmp; 
      if(map.containsKey(tmp)){
        map.put(tmp,map.get(tmp)+1);
      }else{
        map.put(tmp,1);
      }
    }
    int Q = Integer.parseInt(sc.next());
    // System.out.println(Q+"q");
    Long A[] = new Long[Q];
    for(int i=0;i<Q;i++){
      // System.out.println(i+"i");
      Long B = sc.nextLong();
      Long C = sc.nextLong();
      if(map.containsKey(C) && map.containsKey(B)){
        int tmp2 = map.get(B);
        sum += (C - B)*tmp2;
        map.put(C,map.get(C)+tmp2);
        map.put(B,0);
      }else if(map.containsKey(C) && !map.containsKey(B)){
      }else if(!map.containsKey(C) && map.containsKey(B)){
        int tmp3 = map.get(B);
        sum += (C - B)*tmp3;
        map.put(C,tmp3);
        map.put(B,0);
      }
      A[i] = sum;
    }
    for(int i=0;i<Q;i++){
      System.out.println(A[i]);
    }


    // System.out.println(count);
  }
}