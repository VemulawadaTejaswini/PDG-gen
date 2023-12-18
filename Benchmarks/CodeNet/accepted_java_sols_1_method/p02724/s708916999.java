  import java.util.Scanner;

  public class Main {

    public static void main(String[] args) {
      int x = Integer.parseInt(new Scanner(System.in).nextLine());
      int c500 = x/500;
      int r500 = x%500;
      int c5 = r500/5;
      System.out.printf("%d\n",c500*1000+c5*5);
    }
  }