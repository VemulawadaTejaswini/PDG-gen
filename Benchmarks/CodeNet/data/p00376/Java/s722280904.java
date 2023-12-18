import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        String[] tmp = scanner.nextLine().split(" ");
        int x1 = Integer.valueOf(tmp[0]);
        int x2 = Integer.valueOf(tmp[1]);
        System.out.println(solver(x1,x2));
      }
    }
  }

  private static int solver(int x1,int x2)
  {
    return Math.max(x1, x2) - Math.min(x1, x2);
  }
}

