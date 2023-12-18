
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
//    int[] height = new int[n];
    int max = 0;
    int res = 0;
    for (int i=0;i<n;i++) {

      int height = cin.nextInt();
      if (height >= max) {
        res++;
        max = height;
      }

    }
    System.out.println(res);
  }

}
