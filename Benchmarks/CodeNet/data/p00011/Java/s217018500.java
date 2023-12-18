import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = Integer.parseInt(sc.next());
    int[] array = new int[w];
    for(int i=0; i<w; i++){
      array[i] = i+1;
    }

    int n = Integer.parseInt(sc.next());
    String blank = sc.nextLine();

    for(int i=0; i<n; i++){
      int[] intArray = Arrays.stream(sc.nextLine().split(","))
                             .mapToInt(Integer::parseInt)
                             .toArray();
      swap(intArray);
    }
    for(int i=0; i<w; i++){
      System.out.println(array[i]);
    }
  }

  public static void swap(int[] num){
    int tmp = num[0];
    num[0] = num[1];
    num[1] = tmp;
  }
}
