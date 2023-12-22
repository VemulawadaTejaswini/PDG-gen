import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int compare = k;
    int count = 1;
    while(compare <= n){
      compare *= k;
      count++;
    }
    System.out.println(count);
  }
}
