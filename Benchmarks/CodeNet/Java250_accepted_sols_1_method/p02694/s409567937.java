import java.util.*;

public class Main {
  
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();
    long year = 0;
    
    double kingaku = 100;
    
    do{
      
      kingaku = kingaku * 1.01;
      kingaku = Math.floor(kingaku);
      year++;
    }while(kingaku < x);
    
    System.out.println(year);
    
  }
  
}