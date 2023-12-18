
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int m = cin.nextInt();
    int[] kinds = new int[m];

    for (int i=0;i<n;i++) {

      int k = cin.nextInt();
      for (int j=0;j<k;j++) {
        int in = cin.nextInt();
        kinds[in-1]+=1;
      }

    }
    int count = 0;
    for (int i: kinds) {
      if (i==n)
        count+=1;
    }
    System.out.println(count);
  }

}