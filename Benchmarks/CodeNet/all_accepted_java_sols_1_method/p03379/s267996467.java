import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    String[] S = sc.nextLine().split(" ");
    
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(S[i]);
      list.add(num[i]);
    }
    Collections.sort(list);
    int a = list.get(N/2-1);
    int b = list.get(N/2);
    int ans = 0;
    for(int i = 0; i < N; i++){
      ans = num[i] <= a ? b : a;
      System.out.println(ans);
    }
  }
}