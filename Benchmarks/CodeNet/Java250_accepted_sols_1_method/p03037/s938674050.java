
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int m = cin.nextInt();
    int l=0;
    int r=0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < m; i++) {
      l = cin.nextInt();
      r = cin.nextInt();
      max = Math.max(l, max);
      min = Math.min(r, min);
    }
    min = Math.min(min,n);
    System.out.println(Math.max(min-max+1,0));

  }

}
