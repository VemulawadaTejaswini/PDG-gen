import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      int num = Integer.valueOf(input.readLine());
      if (num == 0)
      {
        break;
      }
      printSquare(makeMagicSquare(num));
    }
  }

  private static void printSquare(int[][] square)
  {

    int maxDigit = String.valueOf(square.length * square[0].length).length();

    for (int[] each : square)
    {
      StringBuilder line = new StringBuilder();
      for (int i : each)
      {
        line.append(leftPad(String.valueOf(i), ' ', maxDigit));
        line.append(" ");
      }
      System.out.println(line.toString().substring(0, line.length() - 1));
    }
  }

  private static int[][] makeMagicSquare(int size)
  {
    int[][] ret = new int[size][size];

    int x = size / 2 + size % 2 - 1;
    int y = size / 2 + size % 2;
    ret[y][x] = 1;

    for (int i = 2; i <= size * size; i++)
    {
      int[] position = getNextPosition(ret, x, y);
      x = position[1];
      y = position[0];
      ret[y][x] = i;
    }
    return ret;
  }

  private static int[] getNextPosition(int[][] square, int x, int y)
  {
    int ret_x = x + 1;
    int ret_y = y + 1;

    while (true)
    {

      if (ret_x == square[0].length)
      {
        ret_x = 0;
      }
      else if (ret_x < 0)
      {
        ret_x = square[0].length - 1;
      }
      if (ret_y == square.length)
      {
        ret_y = 0;
      }
      else if (ret_y < 0)
      {
        ret_y = square.length - 1;
      }

      if (square[ret_y][ret_x] == 0)
      {
        int[] ret =
        { ret_y, ret_x };
        return ret;
      }

      ret_x--;
      ret_y++;
    }
  }

  private static String leftPad(String str, char padChar, int length)
  {
    for (int i = str.length(); i < length; i++)
    {
      str = String.valueOf(padChar) + str;
    }
    return str;
  }

}