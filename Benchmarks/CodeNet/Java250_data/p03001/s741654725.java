import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long w = sc.nextLong();
    long h = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    
    double area = (w*h)/2.0;
    int ju = 0;
    
    if(w == 2*x && h == 2*y) ju = 1;

    System.out.println(area + " " + ju);
    
  }
}