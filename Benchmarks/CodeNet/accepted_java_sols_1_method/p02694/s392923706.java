import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double targetPrice = scanner.nextDouble();
    
    int year = 0;
    double result = 100.0;
    
    while(result < targetPrice){
      result = result + Math.floor(result * 0.01);
      year++;
    }
    
    System.out.println(year);
    
  }
}