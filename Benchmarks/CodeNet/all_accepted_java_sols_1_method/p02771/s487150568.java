import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean bl;
        if ((a==b&&a!=c) || (a==c&&a!=b) || (b==c&&a!=c)) {
            bl =true;
        } else {
            bl = false;
        }
        System.out.println(bl?"Yes":"No");
    }
}