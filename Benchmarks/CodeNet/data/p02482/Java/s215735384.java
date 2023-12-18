import java.util.Scanner;

public class Main{
  public static void main{
    Scanner scan = new Scanner(System.in);
    int a = nextInt(scan);
    int b = nextInt(scan);
    
    if(a>b){
      System.out.println("a > b");
    }else if(a<b){
      System.out.println("a < b");
    }else{
      System.out.println("a == b");
    }
  }
}