import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int total;
    total=n*800;
    int d=n/15;
    int k=d*200;
    int ans=total-k;
    System.out.println(ans);
  }
}
