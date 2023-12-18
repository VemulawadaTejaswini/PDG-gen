import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int m = sc.nextInt();
    int n = sc.nextInt();
    
    int mMinusOne = m - 1;
    int nMinusOne = n - 1;
    
    System.out.println(mMinusOne * nMinusOne);
  }
}