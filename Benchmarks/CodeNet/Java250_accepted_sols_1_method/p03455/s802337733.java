import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = num1 * num2;
      int checknum = num3 % 2;
      if(checknum == 0){
      System.out.println("Even" /*+ checknum*/);
      }
      else{
        System.out.println("Odd"/* + checknum*/); 
      }
  }
}