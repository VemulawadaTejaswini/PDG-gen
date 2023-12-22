import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double max = w * h / 2;
    System.out.println(max);
    int ch = 0;
    if(w/2==x&&h/2==y)ch++;
    System.out.println(ch);

  }
}
