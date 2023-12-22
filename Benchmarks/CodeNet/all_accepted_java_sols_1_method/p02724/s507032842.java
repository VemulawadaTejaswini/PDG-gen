import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int out = 0;
    out += (x / 500) * 1000;
    out += ((x % 500) / 5) * 5;
    System.out.println(out);
  }
}