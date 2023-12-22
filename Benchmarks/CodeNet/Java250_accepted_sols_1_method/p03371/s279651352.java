import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int min =1000000000;
    for (int i =0; i<=Math.max(X,Y) * 2; i+=2) {
      int ans = i * C + Math.max(0,(X - i/2)) * A + Math.max(0,Y - i/2) * B;
      min = Math.min(ans,min);
    }
    System.out.println(min);
  }
}    