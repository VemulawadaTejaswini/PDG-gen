import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    long result = 1;
    for(int i = 0; i < n; i++){
      result = result * (m - i);
      result = result % 1000000007;
    }

          result = result * (m - i - 1);
      result = result % 1000000007;
    
    for(int i=0; i<n-1; i++){
      result = result * (m - i - 1);
      result = result % 1000000007;
    }

    System.out.println(result);

  }
}