import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       int d;
       int r;
       double f;
       
       d = a / b;
       r = a % b;
       f = 1.0 * a / b;
       
       System.out.print(d + " " + r + " " + String.format("%8f", f));
    }
}