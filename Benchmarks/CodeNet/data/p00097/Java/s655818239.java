import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0 から 100 の数字から異なる n 個の数を取り出して合計が s となる組み合わせの数を出力する
 * n 個の数はおのおの 0 から 100 までとし、１つの組み合わせに同じ数字は使えません。
 * @author sugawara-a2
 *
 */

public class main
{

  final private static int LIMIT = 100;

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      String[] INPUT_STR = input.readLine().split(" ");
      int numCount = Integer.valueOf(INPUT_STR[0]);
      int sumNumber = Integer.valueOf(INPUT_STR[1]);

      if (numCount == 0 && sumNumber == 0)
      {
        break;
      }

      long ans = solver(numCount, sumNumber);
      System.out.println(ans);
    }
  }

  private static long solver(int numCount, int sumNumber)
  {
    // n個（numCount）の重複しない0以上の整数を足し合わせた際の最小値が
    // sumNumberより大きい場合は組合せなし
    if (sumNumber < sumUp(numCount - 1))
    {
      return 0;
    }

    // n個（numCount）の重複しないLIMIT以下の整数を足し合わせた際の最大値が
    // sumNumberより小さい場合は組合せなし
    if ((LIMIT * numCount) - sumUp(numCount - 1) < sumNumber)
    {
      return 0;
    }

    // n個(numCount)の重複しない0以上の整数を足し合わせた際の最小値をsumNumberから除算した値とLIMITを比較し小さい値を開始数にする
    int startIndex = Math.min(LIMIT, sumNumber - sumUp(numCount - 1));
    sumNumber = sumNumber - sumUp(numCount - 1);
    return solver(numCount, sumNumber, 0, startIndex);
  }

  private static long solver(int numCount, int sumNumber, int currentSum, int startIndex)
  {
    long ret = 0;
    for (int i = numCount; i > 0; i--)
    {
      startIndex = startIndex / 2;
      ret += startIndex;
    }
    return ret;
  }

  private static int sumUp(int num)
  {
    // ZeroOrigin
    num--;
    return (int) ((int) (num + 1) * num * 0.5);
  }
}

