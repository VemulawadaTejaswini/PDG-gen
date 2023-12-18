
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str1 = sc.nextLine().split(" ");
    int n = Integer.parseInt(str1[0]);
    int k = Integer.parseInt(str1[1]);

    String[] str2 = sc.nextLine().split(" ");

    int[] int1 = new int[n];
    for(int i = 0; i < n;i++) {
      int1[i] = Integer.parseInt(str2[i]);
    }

    Arrays.sort(int1);
    int count = 0;

    for(int i = 0; i <= k-1;i++) {
      count += int1[i];
    }

    System.out.println(count);

  }

}
