import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int k = scan.nextInt();
    int sum = 0;
    for (int i=n;i<=m;i++){
      if (i%k == 0){
        sum += 1;
      }
    }
    System.out.println(sum);
  }
}
