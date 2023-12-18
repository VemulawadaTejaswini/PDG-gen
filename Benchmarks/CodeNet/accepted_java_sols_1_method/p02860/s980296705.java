import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        String ret = "No";
        if (n % 2 == 0) {
            String t1 = s.substring(0, n / 2);
            String t2 = s.substring(n / 2, s.length());
            if (t1.equals(t2))
                ret = "Yes";
        }
        System.out.println(ret);
    }
}
