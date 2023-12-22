import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Integer[] age753 = {7,5,3};
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if (Arrays.asList(age753).contains(x)) System.out.println("YES");
    else System.out.println("NO");
  }
}