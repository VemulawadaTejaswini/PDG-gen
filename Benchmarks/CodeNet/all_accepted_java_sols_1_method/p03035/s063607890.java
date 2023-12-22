import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int old = sc.nextInt();
    int money = sc.nextInt(); 
    int ans = 0;
    if(old <= 5) ans = 0;
    else if(old >= 13) ans = money;
    else ans = money / 2;
    System.out.println(ans);
  }
}