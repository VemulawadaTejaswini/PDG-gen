import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int[] sec = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      sec[i] = Integer.parseInt(S[i]);
      sum += sec[i];
    }
    
    int M = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < M; i++){
      String[] T = sc.nextLine().split(" ");
      int a = Integer.parseInt(T[0]);
      int b = Integer.parseInt(T[1]);
      System.out.println(sum - (sec[a-1] - b));
    }
  }
}