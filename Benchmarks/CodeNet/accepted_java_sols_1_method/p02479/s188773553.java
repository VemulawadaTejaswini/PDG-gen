import java.util.Scanner;
import java.lang.Math;
public class Main {
  
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
  
        double r = sc.nextDouble();      
        double pi = Math.PI;
  
        double area = r * r * pi/* ここを変えて面積を求めよう */;
  
        double length = pi * r * 2/* ここを変えて周囲の長さを求めよう */;
  
        System.out.printf("%6f %6f\n",area, length);
        sc.close();
    }
  
}