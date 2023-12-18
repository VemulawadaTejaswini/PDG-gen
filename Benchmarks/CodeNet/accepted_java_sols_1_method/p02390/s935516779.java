import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),h,m,c;
        c=a%60;a/=60;
        m=a%60;h=a/60;
        System.out.printf("%d:%d:%d\n",h,m,c);
    }
}
