import java.util.*;

public class Main {
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
  	int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    int average = (a+b)/2;
    
    if ((a+b)%2 != 0){
      average++;
    }
    
    System.out.println(average);
  }
}