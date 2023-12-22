import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
      
        int a =X%500;
        int b =X/500;
        int c =a/5;
      
      System.out.println((500*b)*2+5*c);
    }
 }
      
 