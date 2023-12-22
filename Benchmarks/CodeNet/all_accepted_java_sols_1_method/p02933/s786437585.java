import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ret = "red";
        if (a >= 3200) {
            ret = sc.next();
        }
        System.out.println(ret);
        sc.close();
    }
}
