import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean[][] symmetryFlg = new boolean[128][128];

    symmetryFlg['i']['i'] = true;
    symmetryFlg['w']['w'] = true;
    symmetryFlg[')']['('] = true;
    symmetryFlg['('][')'] = true;

    while(sc.hasNext()){
      char[] s = sc.next().toCharArray();
      int n = s.length;
      int modifyCount = 0;

      for(int i = 0; i < (n + 1) / 2; i++){
        if(!symmetryFlg[s[i]][s[n - i - 1]]){
          modifyCount++;
        }
      }

      System.out.println(modifyCount);
    }
  }
}