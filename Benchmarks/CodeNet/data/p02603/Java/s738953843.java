import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    a[0] = 0;
    for(int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }
    int money = 1000;
    int kabu = 0;
    for(int day = 1; day < n; day++) {
      if(a[day] < a[day+1]) {
        while(money >= a[day]) {
          kabu++;
          money = money - a[day];
        }
      }else if(a[day] > a[day+1]) {
        while(kabu > 0) {
          kabu--;
          money = money + a[day];
        }
      }
    }

    while(kabu > 0) {
      kabu--;
      money = money + a[n];
    }

    System.out.println(money);

  }
}