import java.util.*;

public class Main{
  public static void main(String[] args){
    int Children;
    int Candies = 0;
    
    Scanner scanner = new Scanner(System.in);
    Children = scanner.nextInt();
    
    if(Children >= 1 && Children <= 100){
      for(int i = 1; i <= Children; i++){
        Candies += i;
      }
      System.out.println(Candies);
    }
  }
}