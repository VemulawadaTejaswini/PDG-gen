import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();                                             
        int b = scan.nextInt();
        int area = a * b;
        int circ = (a + b) * 2;
  
        System.out.println(area + " " + circ);
    }
}