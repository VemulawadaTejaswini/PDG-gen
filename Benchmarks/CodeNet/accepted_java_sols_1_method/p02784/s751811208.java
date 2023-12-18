import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int a = 0;
    String ans = "No";
    for(int i=0; i<n; ++i)
      a += sc.nextInt();
    if(h <= a) ans = "Yes";
    System.out.println(ans);
  }
}