import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    int t = (y - 2*x)/2;
    int c = x - t;
    
    if(t < 0 || c < 0 || y%2 == 1)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}