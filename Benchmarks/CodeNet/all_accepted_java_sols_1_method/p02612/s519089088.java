import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int a = n%1000;
    
    int b = 1000-a;
    
    if(b != 1000){
      System.out.println(b);
    }else{
      System.out.println(0);
    }
  
  }
}