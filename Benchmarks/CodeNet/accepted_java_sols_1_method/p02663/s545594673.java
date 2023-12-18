import java.util.Scanner;
import java.util.InputMismatchException;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int input1 = scanner.nextInt();
    int input2 = scanner.nextInt();
    int input3 = scanner.nextInt();
    int input4 = scanner.nextInt();
    int input5 = scanner.nextInt();
    
    int int1 = input3 - input1;
    int1 = int1 * 60;
    int int2 = input4 - input2;
    int int3 = int1 + int2;
    int3 = int3 - input5;
    System.out.println(int3);
  };
};