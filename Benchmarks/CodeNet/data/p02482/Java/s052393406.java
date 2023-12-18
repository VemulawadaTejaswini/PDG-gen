import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt(scan);
    int b = scan.nextInt(scan);
    
    if(a>b){
      System.out.println("a > b");
    }else if(a<b){
      System.out.println("a < b");
    }else{
      System.out.println("a == b");
    }
  }
}