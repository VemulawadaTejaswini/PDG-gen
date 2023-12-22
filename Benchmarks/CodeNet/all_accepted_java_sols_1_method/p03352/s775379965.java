import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    int max = 1;
    for(int i = 2; i <= Math.sqrt(N); i++){
      int n = i;
      for(int j = 2; n*i <= N; j++){
        n *= i;
      }
      max = max < n ? n : max;
    }
    System.out.println(max);
  }
}