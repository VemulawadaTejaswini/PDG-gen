import java.util.Scanner;
  
public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int ans = new Main().gcd(Math.max(a, b), Math.min(a, b));
                System.out.println(ans);
        }
        public int gcd(int b, int l) {
                if (l == 0)
                        return b;
                if (l == 1)
                        return l;
                return gcd(l, b % l);
        }
}
