import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int ans = 1;
    while(n/k>0){
      ans++;
      n=n/k;
    }

    System.out.println(ans);
  }
}
