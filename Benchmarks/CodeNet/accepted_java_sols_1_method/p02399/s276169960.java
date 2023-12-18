import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    float f;
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(a / b + " " + a % b + " " + a / b + "."  + (int)(-100000 * (a / b - (double)a / b)));
    sc.close();
  }
}

