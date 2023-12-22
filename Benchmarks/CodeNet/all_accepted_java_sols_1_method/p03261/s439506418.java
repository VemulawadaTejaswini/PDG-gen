import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] str = new String[N];
    Set<String> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      str[i] = sc.next();
      set.add(str[i]);
    }
    for (int i = 1; i < N; i++) {
      if (str[i].charAt(0) != str[i - 1].charAt(str[i - 1].length() - 1)) {
        System.out.println("No");
        return;
      }
    }
    if(set.size() == N){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
    