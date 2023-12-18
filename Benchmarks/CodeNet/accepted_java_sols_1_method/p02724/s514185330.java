import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n/500*1000+(n%500/5)*5);
  }
}