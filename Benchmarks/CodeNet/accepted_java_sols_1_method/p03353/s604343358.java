import java.util.*;

public class Main{
  static int H, W;
  static char[][] field;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int N = sc.nextInt();
    Set<String> set = new HashSet<>();
    for(int i = 1; i <= N; i++){
      for(int j = 0; j < S.length()-i+1; j++){
        set.add(S.substring(j,j+i));
      }
    }
    List<String> list = new ArrayList<>(set);
    Collections.sort(list);
    System.out.println(list.get(N-1));
  }
}
      