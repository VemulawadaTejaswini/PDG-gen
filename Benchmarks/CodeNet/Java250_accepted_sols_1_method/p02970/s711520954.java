import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int ans = ((N+(2*K+1)-1))/(2*K+1);
    System.out.print(ans);
  }
}
