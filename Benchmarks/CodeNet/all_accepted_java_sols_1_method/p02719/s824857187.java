import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long surplus = n%k;
    long ans = Math.min(surplus,Math.abs(surplus-k));
    System.out.println(ans);
  }
}