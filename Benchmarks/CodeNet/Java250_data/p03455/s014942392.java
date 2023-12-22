import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int multiply1 = sc.nextInt();
          int multiply2 = sc.nextInt();
          int sum = multiply1 * multiply2;
          if(sum % 2 == 0) {
            System.out.println("Even");
          } else {
            System.out.println("Odd");
          }
          }
  }