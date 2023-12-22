import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double N = Integer.parseInt(sc.next());
    double D = Integer.parseInt(sc.next());
    System.out.println((int)Math.ceil(N/(2*D+1)));
  }
}
