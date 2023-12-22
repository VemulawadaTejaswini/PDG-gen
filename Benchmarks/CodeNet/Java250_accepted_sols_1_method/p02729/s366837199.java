import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int nn = (n*(n-1))/2;
    int mn = (m*(m-1))/2;
    
    System.out.println(nn+mn);
  }
}