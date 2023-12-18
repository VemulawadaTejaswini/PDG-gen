import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a,b;
       int gcd = 1;
       Scanner input = new Scanner(System.in);
      a = input.nextInt();
      b = input.nextInt();
      for(int i = 1;i<=a&&i<=b;i++)
      {
          if(a%i==0&&b%i==0)
          {
              gcd = i;  
          }
      }
      System.out.println(gcd);
    }  
}