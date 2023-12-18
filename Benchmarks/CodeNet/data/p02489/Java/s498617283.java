import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int i = 1;
      int num = sc.nextInt();
      if(num == 0){
        break;
      }
      System.out.println("Case " + i + ": " + num);
      i++;
    }
  }
}