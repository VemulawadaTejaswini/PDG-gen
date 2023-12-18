import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int ex;
    if (N <= K){
      ex = N*X;
    }else{
      ex = K*X + (N-K)*Y;
    }
    System.out.println(ex);
  }
}
