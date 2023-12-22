import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    long rtn = 0;

    while (i <= n) {
      if (i % 3 == 0 || i % 5 == 0){
        i++;
      } else {
        rtn += i;
        i++;
      }
    }
    System.out.println(rtn);
  }
}