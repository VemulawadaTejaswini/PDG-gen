import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = sc.next();
    for (int i = 1 ; i < n ; i++){
      String in = sc.next();
      if (in.compareTo(ans) < 0)
        ans = in;
    }
    System.out.println(ans);
  }
}