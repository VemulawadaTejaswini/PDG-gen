import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double d = scan.nextInt();
    double t = scan.nextInt();
    double s = scan.nextInt();
    
    if(d/s <= t){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}