

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = Math.max(sc.nextInt(),sc.nextInt());
    int n = sc.nextInt();
    int ans = n/max;
    if(n%max!=0) ans++;
    System.out.println(ans);
  }

}
