import java.util.*;

class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
   long k = s.nextLong();
    String st = s.next();
    long len = st.length();
    long ans = 1;
   
    
      int j = 0;
      long num = len + 1;
      while(j < k)
      {
        ans *= (num + j);
        ans = ans%1000000007;
        j++;
      }
    System.out.println(ans%1000000007);
  }
}