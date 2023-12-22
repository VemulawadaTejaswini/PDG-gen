import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int s = sc.nextInt();
    int w = sc.nextInt();
    
    if(s <= w){
      System.out.print("unsafe");
    }else{
      System.out.print("safe");
    }
    
  }
}