import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //左に乗せる
       int A = scanner.nextInt();
       int B = scanner.nextInt();
       //右に乗せる
       int C = scanner.nextInt();
       int D = scanner.nextInt();

       String slope = "Balanced";

       if (A+B > C+D) {
           slope = "Left";
       } else if (A+B < C+D) {
           slope = "Right";
       }

       System.out.println(slope);
    }
}