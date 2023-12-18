import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Integer.parseInt(sc.nextLine()));
    }
    Collections.sort(list);
    int ans = 1000000000;
    for(int i = 0; i < N-K+1; i++){
      if(list.get(i+K-1)-list.get(i) < ans){
        ans = list.get(i+K-1)-list.get(i);
      }
    }
    System.out.println(ans);
  }
}