import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] group = new int[N];
    for (int i = 1; i <= N; i++){
      int j = sc.nextInt();
      group[j - 1] = i;
    }
    for (int k = 0; k < N-1; k++){
      System.out.print(group[k]+" ");
    }
    System.out.println(group[N-1]);
  }
}