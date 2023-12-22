import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();

    double d =  t/a;
    double ans =(int) b*d;
    int mainans = (int) ans;
    System.out.println(mainans);


    }
  }
