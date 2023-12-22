
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int x = cin.nextInt();

    int len = 0;
    int count = 1;

    int[] bounce = new int[n+1];

    for (int i=1;i<=n;i++) {
      bounce[i] = bounce[i-1] + cin.nextInt();
    }

    int i;
    for (i=0;i<=n;i++) {

      if (bounce[i]>x) {
        System.out.println(i);
        return;
      }

    }

    System.out.println(i);

  }

}