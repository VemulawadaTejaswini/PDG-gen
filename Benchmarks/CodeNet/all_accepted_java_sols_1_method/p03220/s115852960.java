import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int[] H = new int[N];
    double min = 100000L;
    int ansIndex = -1;
    for(int i = 0; i < N; i++){
      H[i] = sc.nextInt();
      double tmp = Math.abs(A - T + H[i] * 0.006);
      if(min > tmp){
        min = tmp;
        ansIndex = i;
      }
    }
    System.out.println(ansIndex + 1);
  }
}