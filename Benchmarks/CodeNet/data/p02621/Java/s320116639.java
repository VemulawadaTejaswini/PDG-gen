import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int a = input.nextInt();
    if (a >= 0 && a<=10){
      System.out.println(a + a * a + a * a * a);
    }else{
      return;
    }
  }
}
