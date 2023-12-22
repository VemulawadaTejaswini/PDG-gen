import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int value = 0;
    if (A >= 13){
      value = B;
    } else if (A >= 6){
      value = B / 2;
    }
    System.out.println(value);
  }
}
