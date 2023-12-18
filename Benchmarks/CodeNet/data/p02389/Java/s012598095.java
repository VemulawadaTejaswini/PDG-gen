import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      Scanner scanner = new Scanner(System.in);
      String line = scanner.next();
      String line2 = scanner.next();
     
      int a = Integer.parseInt(line);
      int b= Integer.parseInt(line2);


      System.out.println((a*b) + " "+ (2*(a+b)));
      }
}

