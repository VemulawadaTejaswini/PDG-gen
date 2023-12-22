import java.util.Scanner;

 class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //"1~100までの整数を入力してください
  int N = scanner.nextInt();
    if(N % 2 ==0) {
      System.out.println((double)1/2);
    }else{
      System.out.println((double)(N+1)/2/N);
    }
  }
  }