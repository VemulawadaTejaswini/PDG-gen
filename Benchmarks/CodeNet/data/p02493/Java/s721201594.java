import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int [] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[n-i-1] = sc.nextInt();
    }
    System.out.println(a);
  }
}