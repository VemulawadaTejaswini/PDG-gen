import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    if(N>=K){
      System.out.println(0);
      return;
    }
    
    List<Integer> list1 = new ArrayList<>();
    String[] T = sc.nextLine().split(" ");
    for(int i = 0; i < K; i++){
      list1.add(Integer.parseInt(T[i]));
    }
    Collections.sort(list1);
    
    List<Integer> list2 = new ArrayList<>();
    for(int i = 0; i < K-1; i++){
      list2.add(list1.get(i+1)-list1.get(i));
    }
    Collections.sort(list2, Collections.reverseOrder());
    
    for(int i = 0; i < N-1 && list2.size() > 0; i++){
      list2.remove(0);
    }
    int ans = 0;
    for(int i = 0; i < list2.size(); i++){
      ans += list2.get(i);
    }
    System.out.println(ans);
  }
}