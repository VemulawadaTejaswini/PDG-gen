import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double d = sc.nextInt();
        int ret = (int) (n / (d * 2 + 1));
        if (n % (d * 2 + 1) != 0) {
            ret++;
        }
        System.out.println(ret);
        sc.close();
    }
}
