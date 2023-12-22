import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int j = n%10;
    if (j == 2 || j == 4 || j == 5 || j == 7 || j == 9){
      System.out.println("hon");
    }else if (j == 0 || j == 1 || j == 6 || j == 8){
      System.out.println("pon");
    }else{
      System.out.println("bon");
    }
  }
}