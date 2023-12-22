import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    if(a >= 13){
      System.out.println(b);
    }else if(a >= 6 && a <= 12){
      System.out.println(b / 2);
    }else if(a <= 5){
      System.out.println(0);
    }
  }
}
