import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int onedan=sc.nextInt();
   int X=onedan%1000;
   int x=1000-X;
   System.out.println(x);
  }
}