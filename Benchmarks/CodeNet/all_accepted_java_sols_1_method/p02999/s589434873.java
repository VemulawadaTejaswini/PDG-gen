import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    int a = X < A ? 0 : 10;
    System.out.println(a);
  }
}