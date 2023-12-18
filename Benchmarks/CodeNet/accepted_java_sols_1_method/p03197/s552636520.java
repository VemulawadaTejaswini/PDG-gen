import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    long[] a = new long[n];
    for (int i=0;i<n;i++) {
      long in = cin.nextLong();
      if (in%2==1) {
        System.out.println("first");
        return;
      }
    }

    System.out.println("second");

  }

}