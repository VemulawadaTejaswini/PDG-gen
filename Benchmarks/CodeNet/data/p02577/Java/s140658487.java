import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n_st = sc.next();
    int n = Integer.parseInt(n_st);

    long a = 0;
    long keta = 0;
    long nn = n;
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
