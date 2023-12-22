import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
 
    int mulValue = k;
    
    for(int mulCount = 1; mulValue <= b; mulCount++){
      mulValue = k * mulCount;
      if(a <= mulValue && mulValue <= b){
        System.out.println("OK");
        return;
      }
    }
    System.out.println("NG");
  }
}