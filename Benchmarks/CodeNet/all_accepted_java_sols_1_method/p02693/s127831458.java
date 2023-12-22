import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int count = 0;

    boolean flg = true;

    while(flg) {
      count += k;

      if(a <= count && count <= b) {
        flg = true;
        break;
      }

      if(count > b) {
        flg = false;
        break;
      }
    }

    if(flg) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }

    sc.close();
  }
}