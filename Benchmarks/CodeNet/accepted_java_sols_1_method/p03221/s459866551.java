import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Map<Integer,int[]> sortup = new TreeMap<>();
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[N];
    String[] ans = new String[M];
    for(int i = 0;i < M ;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int[] c = new int[2];
      c[0] = a;
      c[1] = i;
      sortup.put(b,c);
    }
    for(int key : sortup.keySet()){
      int[] c = sortup.get(key);
      ans[c[1]] = String.format("%06d%06d",c[0],++P[c[0]-1]);
    }
    for(int i = 0;i < M ;i++){
      System.out.println(ans[i]);
    }
  }
}