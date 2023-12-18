import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> S = new ArrayList<String>();
    ArrayList<String> T = new ArrayList<String>();
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
      String s = sc.next();
      S.add(s);
    }
    int M = sc.nextInt();
    for(int i=0;i<M;i++){
      String t = sc.next();
      T.add(t);
    }
    HashMap<String,Integer> map = new HashMap<String,Integer>();

    for(int i=0;i<N;i++){
      if(map.containsKey(S.get(i))) map.put(S.get(i),(map.get(S.get(i)).intValue()+1));
      else map.put(S.get(i),1);
    }
    for(int i=0;i<M;i++){
      if(map.containsKey(T.get(i))) map.put(T.get(i),map.get(T.get(i)).intValue()-1);
    }

    ArrayList<Integer> coll = new ArrayList<Integer>(map.values());

    Integer ii = Collections.max(coll);
		System.out.println((ii<0)?0:ii);

  }
}
