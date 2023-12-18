import java.util.*;

public class Main{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   double r = sc.nextInt();

    System.out.printf("%.6f", r*r*Math.PI);
    System.out.print(" ");
    System.out.printf("%.6f", 2*r*Math.PI);
    System.out.println("");
 }
}