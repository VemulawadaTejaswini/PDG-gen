import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextLong();
    long m = 100;
    int ans = 0;
    while (m < x){
      m = m + m/100;
      ans++;
    }
    System.out.println(ans);
  }
}
