import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    for(int i = 0;i < M;i++){
      N = N - scanner.nextInt();
    }
    if(N < 0) N = -1;
    System.out.println(N);
  }
}