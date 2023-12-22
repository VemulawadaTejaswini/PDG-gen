import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int n = 0;
    int m = 0;
    n = N*(N-1)/2;
    m = M*(M-1)/2;
    System.out.println(n+m);   
    return;
  }
}