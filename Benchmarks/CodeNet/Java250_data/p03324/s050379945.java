import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int D = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());
    
    int n = (int)Math.pow(100, D);
    
    System.out.println(N==100 ? n*(N+1) : n*N);
  }
}