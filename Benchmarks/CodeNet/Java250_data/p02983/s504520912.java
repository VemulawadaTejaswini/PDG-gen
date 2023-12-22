import java.util.*;

public class Main {
  public static boolean check(int num) {
    int i;
    for(i = 1; i * i <= num; i++) {
      if(i * i == num) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int i, j, number_l, number_r, ans = 2019;
    Scanner sc = new Scanner(System.in);
    number_l = Integer.parseInt(sc.next());
    number_r = Integer.parseInt(sc.next());
    if(number_r - number_l >= 2019) {
      ans = 0;
    } else {
      for(i = number_l; i <= number_r; i++) {
        if(i % 2019 == 0) {
          ans = 0;
          break;
        }
        for(j = i + 1; j <= number_r; j++) {
          if(ans > ((i % 2019) * (j % 2019)) % 2019) ans = (i % 2019) * (j % 2019) % 2019;
        }
      }
    }
    System.out.println(ans);
  }
}
