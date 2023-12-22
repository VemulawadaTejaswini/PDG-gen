import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum = 0;
    for (int i=0;i<m;i++){
      sum += scan.nextInt();
    }
    if (sum > n){
      System.out.println(-1);
    }
    else{
      System.out.println(n-sum);
    }
  }
}
