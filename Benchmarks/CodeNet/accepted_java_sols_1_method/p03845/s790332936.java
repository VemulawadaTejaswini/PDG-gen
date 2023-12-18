import java.util.*;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    String T_txt = sc.nextLine();
    String[] T = T_txt.split(" ");
    int M = Integer.parseInt(sc.nextLine());
  	List<Integer> ansList = new ArrayList<Integer>();
    for (int cnt = 0; cnt < M; cnt ++) {
      String P_X_txt = sc.nextLine();
      String[] P_X = P_X_txt.split(" ");

      int sum = 0;
      for (int T_cnt = 0; T_cnt < T.length; T_cnt ++) {
        if (T_cnt + 1 == Integer.parseInt(P_X[0])) {
          sum += Integer.parseInt(P_X[1]);
          continue;
        }
        sum += Integer.parseInt(T[T_cnt]);
      }
      ansList.add(sum);
    }

    for (int ans : ansList) {
      System.out.println(ans);
    }
  }
}