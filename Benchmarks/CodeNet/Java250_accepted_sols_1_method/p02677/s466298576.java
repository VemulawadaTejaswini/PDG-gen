
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    double A = sc.nextInt();
    double B = sc.nextInt();

    double Hour = sc.nextInt();
    double Minute = sc.nextInt();

    double x1 = A * Math.cos(2 * Math.PI * (Hour + Minute / 60) / 12);
    double y1 = A * Math.sin(2 * Math.PI * (Hour + Minute / 60) / 12);
    double x2 = B * Math.cos(2 * Math.PI * Minute / 60);
    double y2 = B * Math.sin(2 * Math.PI * Minute / 60);
    
    System.out.println(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));

  }
}