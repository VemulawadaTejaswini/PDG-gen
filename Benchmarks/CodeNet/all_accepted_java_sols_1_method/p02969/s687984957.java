import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double x = r;
        double y = 2;
            double ans = Math.pow(x, y);
            int c = (int)ans*3;
            System.out.println(c);
    }
}