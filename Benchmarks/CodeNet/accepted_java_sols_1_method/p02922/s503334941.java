import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int outlet = 1;
    int cnt = 0;
    while(B>outlet){
      --outlet;
      outlet += A;
      cnt++;
    }
    System.out.print(cnt);
  }
}
