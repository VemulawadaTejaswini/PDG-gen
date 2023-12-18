import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    int count = 0;
    if(m>=2)
      count+=(m)*(m-1)/2;
    if(n>=2)
      count+=(n)*(n-1)/2;
    System.out.println(count);
  }
}
    