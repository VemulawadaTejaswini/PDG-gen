import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int D, N;

    Scanner sc = new Scanner(System.in);

    D = sc.nextInt();
    N = sc.nextInt();

    System.out.print((int)((N + N/100)*Math.pow(100, D)));
  }
}
