import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    String ans = "Christmas";

    if (D == 25){
      System.out.println(ans);
    }else if (D == 24){
      System.out.println(ans + " Eve");
    }else if (D == 23){
      System.out.println(ans + " Eve Eve");
    }else if (D == 22){
      System.out.println(ans + " Eve Eve Eve");
    }
  }
}
