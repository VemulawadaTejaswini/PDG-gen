import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner scan = new java.util.Scanner(System.in);
       double r = scan.nextInt();
       System.out.println(String.format("%.6f", r * r * Math.PI) + " " + String.format("%.6f", 2 * r * Math.PI));
    }
}