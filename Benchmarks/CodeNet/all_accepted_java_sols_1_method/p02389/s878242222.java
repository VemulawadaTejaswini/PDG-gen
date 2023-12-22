import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);  
         
         int a = scan.nextInt();
         int b = scan.nextInt();
         int m = a * b;
         int s = 2 * a + 2 * b; 
       
          System.out.println(m + " " + s);
      }
 }