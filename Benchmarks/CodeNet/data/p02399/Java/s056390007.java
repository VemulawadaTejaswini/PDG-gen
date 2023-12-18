import java.util.*;

public class Ex10{
  public static void Main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    double f;
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(a / b + " " + a % b + " " + a / b + "." + ((double)a / b - a / b));
    sc.close();
  }
}

