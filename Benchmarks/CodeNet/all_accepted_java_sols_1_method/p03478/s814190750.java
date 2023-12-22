import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = 0;
        for (int i=1; i <= n; i++) {
            int x = i;
            int digSum = 0;
            while (x>0) {
                digSum += x %10;
                x /= 10;
            }
            if (digSum >= a && digSum <= b)
                s += i;
        }
        System.out.println(s);
        sc.close();
    }
}