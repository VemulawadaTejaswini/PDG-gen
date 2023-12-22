import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    ans = a + b + c;
    if(ans <= 21){
      System.out.println("win"); 
    }else{
      System.out.println("bust");
      }
  }
}