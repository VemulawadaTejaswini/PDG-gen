import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int t = s.nextInt();
    int c = 10000;
    for(int i = 0; i < n; i++){
      int ci = s.nextInt();
      if(s.nextInt() <= t)
        c = c > ci ? ci : c;
    }
    if(c <= 1000)
      System.out.println(c);
    else
      System.out.println("TLE");
  }
}