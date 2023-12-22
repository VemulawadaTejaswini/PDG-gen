import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int input1 = scanner.nextInt();
    int input2 = scanner.nextInt();
    int num1 = input1 * input2;
    System.out.println(num1);
  };
};