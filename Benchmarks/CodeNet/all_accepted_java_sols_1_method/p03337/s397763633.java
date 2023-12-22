import java.util.Scanner;

public class Main {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    //if(a instanceof int && b instanceof int) {
      if(a <= 1000 && a >= -1000 && b <= 1000 && b >= -1000) {
        int plus = a + b;
        int minus = a - b;
        int kake = a * b;

        if(minus > plus) {
          if(minus > kake) {
            System.out.print(minus);
          } else {
            System.out.print(kake);
          }
        } else {
          if(plus > kake) {
            System.out.print(plus);
          } else {
            System.out.print(kake);
          }
        }
      } else {
        return;
      }
    //} else {
    //  return;
    //}

    sc.close();
  }
}