import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int inputA = scanner.nextInt();
    int inputB = scanner.nextInt();
    if(inputA >= 3 && inputB <= 20){
      if(inputB >= 3 && inputB <= 20){
        if(inputA > inputB + 1){
          sum = inputA + inputA - 1;
        }else if(inputB > inputA + 1){
          sum = inputB + inputB - 1;
        }else if(inputA == inputB + 1 || inputB == inputA + 1){
          sum = inputA + inputB;
        }else{
          sum = inputA + inputB;
        }
      }else{
        System.exit(1);
      }
    }else{
      System.exit(1);
    }
    System.out.println(sum);
    scanner.close();
  }
}
