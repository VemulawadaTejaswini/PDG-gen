import java.util.*;

class Main{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<String, Integer> counts = new HashMap<String, Integer>();
    int count = 0;
    for(int i=0;i<N;i++){
      String K = sc.next();
      int t = counts.getOrDefault(K, 0);
      counts.put(K, t + 1);
      count = Math.max(count, t + 1);
   }
    List<String> st = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() == count) {
                st.add(entry.getKey());
            }
        }
        
        Collections.sort(st);
        for(String s : st) {
            System.out.println(s);
        }

    

  }
}