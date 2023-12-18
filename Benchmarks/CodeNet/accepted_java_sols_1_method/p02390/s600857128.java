import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int s = sc.nextInt();
    int h = s / 3600;
    s -= h * 3600;
    int m = s / 60;
    s -= m * 60;
    System.out.printf("%d:%d:%d\n", h,m,s);
    sc.close();
  }
}

