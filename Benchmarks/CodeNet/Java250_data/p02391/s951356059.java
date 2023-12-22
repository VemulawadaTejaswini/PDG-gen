import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int inputA = scanner.nextInt();
    int inputB = scanner.nextInt();

    if(inputA<inputB){
      System.out.println("a < b");
    }else if(inputA>inputB){
      System.out.println("a > b");
    }else{
      System.out.println("a == b");
    }
  }
}