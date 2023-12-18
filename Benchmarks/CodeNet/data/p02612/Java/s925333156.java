import java.util.Scanner;

public class Main {

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    Integer cost = sc.nextInt();
    
    System.out.println(1000 - cost <= 0 ? 0 : 1000-cost );
  
  }
}