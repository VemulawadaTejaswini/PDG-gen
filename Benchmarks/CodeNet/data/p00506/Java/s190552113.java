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
        solver(data);
      }
    }
  }

  private static void solver(String[] data)
  {
    Long[] numArray = new Long[data.length];
    for (int i = 0; i < data.length; i++)
    {
      numArray[i] = Long.valueOf(data[i]);
    }

    for (int i = 1; i <= minNum(numArray); i++)
    {
      int count = 0;
      for (long num : numArray)
      {
        if (num % i == 0) {
          count++;
        }
      }
      if(count == numArray.length) {
        System.out.println(i);
      }
    }
  }

  private static Long minNum(Long[] numArray)
  {
    long min = Long.MAX_VALUE;
    for (long num : numArray)
    {
      min = Math.min(min, num);
    }
    return min;
  }

}

