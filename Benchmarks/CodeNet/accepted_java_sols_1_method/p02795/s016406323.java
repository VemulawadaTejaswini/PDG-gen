import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    
    int M = Math.max(H,W);
    System.out.println((N+M-1)/M);
  }
}