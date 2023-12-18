import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
    double b = sc.nextDouble();
    double bb = 100*b;

    long ans = a * (long)bb;
    double ans1 = ans / 100.0;
    if(ans < 100) System.out.println((int)ans1);
    else System.out.println(ans/100);
  }
}
