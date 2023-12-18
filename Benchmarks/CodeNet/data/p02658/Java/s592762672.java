import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long acum = 1;
    for(int i = 0; i < n; i++) {
      acum *= sc.nextLong();
    }
    sc.close();
    if(acum > 1000000000000000000L || acum < 0) {
      System.out.println("-1");
    } else {
      System.out.println(acum);
    }
  }
}