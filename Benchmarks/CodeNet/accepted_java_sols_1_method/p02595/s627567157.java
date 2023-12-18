import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    long d2 = d * d;
    int answer = 0;
    for(int i = 0; i < n; i++){
      long x = sc.nextLong();
      long y = sc.nextLong();
      long distance2 = (x * x) + (y * y);
      if(d2 >= distance2) answer++;
    }
    System.out.println(answer);
  }
}