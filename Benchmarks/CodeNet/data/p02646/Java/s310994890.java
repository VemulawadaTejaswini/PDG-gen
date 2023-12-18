import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a  =sc.nextLong();
    long v = sc.nextLong();
    long b = sc.nextLong();
    long w = sc.nextLong();
    long t = sc.nextLong();
    String ans = "YES";
    if(v <= w) ans = "NO";
    else if(Math.abs(b-a)/(v-w)  >  t) ans = "NO";
    System.out.println(ans);
  }
}
