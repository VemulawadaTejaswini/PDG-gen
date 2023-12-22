import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int sum = 0;
    int min = 300;
    int apple = min;
    for(int i=1;i<=N;i++){
      int d = L+i-1;
      sum+=d;
      if(Math.abs(d)<min){
        min = Math.abs(d);
        apple = d;
      }
    }
    System.out.println(sum-apple);
  }
}