import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(System.in))
    {
      while (scanner.hasNextLine())
      {
        scanner.nextLine();
        String[] data = scanner.nextLine().split(" ");
        System.out.println(solver(data));
      }
    }
  }

  private static int solver(String[] data)
  {
    int count = 0;
    int maxCount = 0;

    for (int i = 0; i < data.length; i++)
    {
      if (Integer.valueOf(data[i]) == 1)
      {
          count++;
      }
      else
      {
        maxCount = Math.max(maxCount, count);
        count = 0;
      }
    }
    return Math.max(maxCount, count)+1;

  }

}

