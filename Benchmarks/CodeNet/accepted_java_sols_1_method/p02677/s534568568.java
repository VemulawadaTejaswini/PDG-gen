import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = Double.parseDouble(sc.next());
    double B = Double.parseDouble(sc.next());
    double H = Double.parseDouble(sc.next());
    double M = Double.parseDouble(sc.next());
    double radH = -Math.toRadians((H + M / 60D) * 30D) + 90D;
    double radM = -Math.toRadians(M * 6D) + 90D;
    double hX = A * Math.cos(radH);
    double hY = A * Math.sin(radH);
    double mX = B * Math.cos(radM);
    double mY = B * Math.sin(radM);
    double distance = Math.sqrt((hX - mX) * (hX - mX) + (hY - mY) * (hY - mY));
    System.out.println(distance);
  }
}