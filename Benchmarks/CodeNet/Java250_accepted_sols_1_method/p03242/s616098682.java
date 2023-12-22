import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int value;

    List<Integer>list = new ArrayList<Integer>();

    while(N > 0){
      if(N % 10 == 1)
        value = 9;
      else
        value = 1;
      list.add(value);
      N /= 10;
    }

    for(int i=list.size()-1; i>=0; i--){
      System.out.print(list.get(i));
    }
    System.out.println();

  }
}
