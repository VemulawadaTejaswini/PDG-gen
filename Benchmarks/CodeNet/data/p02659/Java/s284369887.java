import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner stdin = new Scanner(System.in);
    long a = stdin.nextLong();
    double b = stdin.nextDouble();
    System.out.println((int)(a*(b*100))/100);
  }
}
