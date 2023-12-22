import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int g=0;
      for (int i=1;i<=5;i++)
      {
          a=in.nextInt();
          if (a==0)
          {
           g=i;
          }
         


        }
      System.out.print(g);

    }
}