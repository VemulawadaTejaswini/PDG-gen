import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String s = a+b;
    double n = Integer.parseInt(s);
    double m = Math.sqrt(n);
    if(n % m*m == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}