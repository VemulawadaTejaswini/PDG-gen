import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[])throws Exception{
    int area = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> D = new ArrayDeque<Integer>();
    Deque<int[]> U = new ArrayDeque<int[]>();

    String str =  br.readLine();
    //一段ごと考える
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '\\')
      D.add(i);
      else if (false==D.isEmpty() && str.charAt(i) == '/') {
        int a = i - D.getLast();
        area += a;
        while (false==U.isEmpty() && D.getLast() < U.getLast()[0]) {
          a += U.getLast()[1];
          //エリアが小さいものを大きいものに含む為にキューを削除
          U.removeLast();
        }
        int[] data = { D.pollLast(), a };
        U.add(data);
      }
    }
    System.out.println(area);
    System.out.print(U.size());
    for(int [] t : U){
      System.out.print(" "+t[1]);
     }
    System.out.println();
  }
}
