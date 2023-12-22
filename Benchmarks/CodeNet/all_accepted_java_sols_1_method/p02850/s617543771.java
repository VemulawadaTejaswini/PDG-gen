import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] inf = new int[N+1];
    int now = 0;
    int paint = 1;
    int[] ans = new int[N-1];
    int max = 0;
    int[][] val = new int[N-1][4];
    for(int i = 0; i < N-1; i++){
      String[] S = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(S[0]);
      val[i][1] = Integer.parseInt(S[1]);
      val[i][2] = i;
    }
    Arrays.sort(val, (a,b)->Integer.compare(a[0],b[0]));
    
    for(int i = 0; i < N-1; i++){
      int a = val[i][0];
      int b = val[i][1];
      if(a == now){
        paint++;
      }else{
        now = a;
        paint = 1;
      }
      if(inf[a] == paint){
        paint++;
      }
      val[i][3] = inf[b] = paint;
      max = max < paint ? paint : max;
    }
    
    Arrays.sort(val, (a,b)->Integer.compare(a[2],b[2]));
    System.out.println(max);
    for(int[] n : val){
      System.out.println(n[3]);
    }
  }
}