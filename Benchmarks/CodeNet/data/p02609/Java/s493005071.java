import java.util.Scanner;
class Main {
  public static int N;
  public static String X;
  public static boolean[] X_dig;
  public static int[] x;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    X = sc.next();

    X_dig = new boolean[N];
    x = new int[N];

    X_dig_set();
    x_set();

    for(int i = 0; i < N; i++) {
      System.out.println(fn(x[i]));
    }
  }

  public static void X_dig_set() {
    String XX = X;
    int XX_dig;
    for(int i = 0; i < N; i++) {
      XX_dig = Character.getNumericValue(XX.charAt(i));
      if(XX_dig == 1) {
        X_dig[i] = true;
      }else{
        X_dig[i] = false;
      }
    }
  }

  public static void x_set() {
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if((i != j && X_dig[j] == true) || (i == j && X_dig[j] == false)) {
          x[i] = x[i] + dignum(j);
        }
      }
    }
  }

  public static int popcount(int n) {
    int popcount = 0;
    int a = n;
    int keta = dignum(0);
    while(a > 0 && keta > 1) {
      if(a >= keta) {
        a = a - keta;
        popcount++;
      }
      keta = keta / 2;
    }

    return popcount;
  }

  public static int fn(int n) {
    int count = 0;
    int a = n;
    while(a > 0) {
      a = a % popcount(a);
      count++;
    }
    return count;
  }

  public static int dignum(int j) {
    int dignum = 1;
    for(int k = 0; k < N-1-j; k++) {
      dignum = dignum * 2;
    }
    return dignum;
  }

}
