import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int a = 0;
    int keta = 0;
    int nn = n;
    while(nn >= 1) {
      keta = nn % 10;
      a = a + keta;
      nn = nn / 10;
    }

    if(a%9 == 0) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
