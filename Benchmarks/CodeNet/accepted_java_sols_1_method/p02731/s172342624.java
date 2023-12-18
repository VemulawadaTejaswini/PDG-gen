import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double l = sc.nextDouble();

    double x = l/3;
    double y = l/3;
    double z = l-x-y;

    System.out.println(x*y*z);

  }

}
