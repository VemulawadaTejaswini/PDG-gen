import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int HP = sc.nextInt();
    int AT = sc.nextInt();
    int X = HP/AT;
    
    if(HP%AT != 0){
      X++;
    }
    System.out.println(X);
  }
}