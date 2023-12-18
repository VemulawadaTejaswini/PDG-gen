import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    int d = a/b;
    System.out.println(d+" "+(a-b*d)+" "+(double)(a/b));
  }
}