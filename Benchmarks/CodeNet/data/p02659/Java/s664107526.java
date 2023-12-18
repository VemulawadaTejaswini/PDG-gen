import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = a*b;
    
    c = Math.floor(c);
    
    System.out.println(c);
  };
};