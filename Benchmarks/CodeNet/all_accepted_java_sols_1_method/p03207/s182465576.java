
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

  //  Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n= cin.nextInt();
    int[] price = new int[n];
    for (int i=0;i<n;i++) {
      price[i] = cin.nextInt();
    }

    Arrays.sort(price);
    price[n-1] = price[n-1]/2;
    int sum = 0;
    for (int i=0;i<n;i++) {
      sum += price[i];
    }
    System.out.println(sum);

  }

}

