import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x =10;
    int a=N%x;
    int sum=a;
    x *= 10;
    int b;

    if(N==0){
      System.exit(0);
    }

    while(x/10<=N){
      a = (N-a) % x;
      b = a/(x/10);
      sum += b;
      x *= 10;
    }
    System.out.printf("%d\n",sum);
  }
}