import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int L = Integer.parseInt(S[1]);
    List<String> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(sc.nextLine());
    }
    Collections.sort(list);
    String ans = "";
    for(int i = 0; i < N; i++){
      ans = ans + list.get(i);
    }
    
    System.out.println(ans);
  }
}