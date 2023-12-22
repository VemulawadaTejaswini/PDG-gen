import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long in = sc.nextLong();
    long out = 1L;
    while(in != 0){
      in /= 2;
      out *= 2;
    }
    System.out.println(out - 1);
  }
}