import java.util.*;
import java.io.*;

public class Conpare {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] intArray = Arrays.stream(sc.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
    int a = intArray[0];
    int b = intArray[1];

    if(a == b)
    {
      System.out.printf("a == b\n");
    }
    else if(a < b)
    {
      System.out.printf("a < b\n");
    }
    else
    {
      System.out.printf("a > b\n");
    }
  }
}
