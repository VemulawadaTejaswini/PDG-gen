import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int E = N / 2;
    int O = N - E;
    double M = (double) O / N;
    System.out.println(M);
  }
}
