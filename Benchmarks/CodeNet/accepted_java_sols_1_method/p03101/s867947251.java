import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int r = sc.nextInt();
    int cn = sc.nextInt();
    int rn = sc.nextInt();
    System.out.println((c - cn) * (r - rn));
  }
}