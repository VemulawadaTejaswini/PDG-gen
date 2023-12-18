import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();
    
    int min1 = (h2 - h1) * 60;
    int min2 = (m2 - m1);
    int min = min1 + min2;
    
    int ans = (min - k);
    
    System.out.println(ans);
  }
}
    