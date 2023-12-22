import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ab = b + a * (int)Math.pow(10,((int)Math.log10(b) + 1));
    int check =0;
    for (int i=1; i<400; i++) {
      if(i * i == ab) {
        check++; 
        break;
      }
    }
    if (check != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}