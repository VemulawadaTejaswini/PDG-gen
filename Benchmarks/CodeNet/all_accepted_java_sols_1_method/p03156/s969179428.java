import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] counts = {0,0,0};
    for(int i = 0; i < N; i++){
      int tmp = sc.nextInt();
      if(tmp <= A){
        counts[0]++;
      }else if(tmp <= B){
        counts[1]++;
      }else{
        counts[2]++;
      }
    }
    System.out.println(Math.min(counts[0], Math.min(counts[1], counts[2])));
  }
}