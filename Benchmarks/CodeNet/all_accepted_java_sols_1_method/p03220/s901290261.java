
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

 //   Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int t = cin.nextInt();
    int a = cin.nextInt();

    double[] temp = new double[n];

    for (int i=0;i<n;i++) {
      double tem = t - 0.006 * cin.nextInt();
      temp[i] = Math.abs(tem - a);
    }
    int pos = 0;
    double min = Integer.MAX_VALUE;
    for (int i=0;i<n;i++) {
      if (temp[i]<min) {
        pos = i;
        min = temp[i];
      }
    }
    System.out.println(pos+1);
  }

}