import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String A[] = new String[N];
    Map<String, Integer> map = new HashMap<String, Integer>();
    int max_cnt = 1;
    for(int i = 0; i < N;i++){
      A[i] = sc.next();
      if(map.containsKey(A[i])){
          map.put(A[i],map.get(A[i])+1);
          max_cnt = Math.max(max_cnt,map.get(A[i]));
      }else{
          map.put(A[i],1);
      }
    }
    ArrayList<String> ar = new ArrayList<String>();
    for(String key : map.keySet()){
        if(map.get(key) == max_cnt){
            ar.add(key);
        }
    }
    Collections.sort(ar);
    for(int i=0; i < ar.size(); i++){
        System.out.println(ar.get(i));
    }  
  }
}


