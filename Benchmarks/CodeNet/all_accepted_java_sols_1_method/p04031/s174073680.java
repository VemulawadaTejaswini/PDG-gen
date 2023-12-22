import java.util.*;
import java.util.stream.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int nums_cnt = Integer.parseInt(line);
    line = sc.nextLine();
    int[] numbers_ary = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    
    int sum = Arrays.stream(numbers_ary).sum();
    
    int value = (int)(Math.round((double)sum / nums_cnt));
    sum = 0;
    for(int i : numbers_ary)
    {
      sum += (int)Math.pow((i - value),2);
    }
    
    System.out.println(sum);
    
  }
}