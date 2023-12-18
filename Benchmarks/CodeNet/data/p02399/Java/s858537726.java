import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    double f;
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(a / b + " " + a % b + " " + (f = (double)a / b));
    sc.close();
  }
}

