import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int[] num = new int[N];
    Set<Integer> set = new HashSet<>();
    String[] T = sc.nextLine().split(" "); 
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(T[i]);
      num[n-1]++;
      set.add(n);
    }
   
    if(set.size() <= K){
      System.out.println(0);
      return;
    }
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(num[i]);
    }
    
    Collections.sort(list, Collections.reverseOrder());
    int ans = 0;
    int sum = 0;
    for(int i = 0; i < K; i++){
      sum += list.get(i);
    }
    ans = N - sum;
    
    System.out.println(ans);
  }
}