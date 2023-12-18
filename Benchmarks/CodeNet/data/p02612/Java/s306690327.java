import java.util.Scanner;

public class Payment{
    public static public void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n;
      System.out.print("N:");
      n = sc.nextInt();

      int x = (n+1000-1)/1000;
      int change = x*1000 - n;

      System.out.println(change);
      }
}
