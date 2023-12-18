import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = a + b+c;
        int max = Math.max(a, Math.max(b,c));
        if ((tmp % 2 == 0 && max % 2 == 0) || (tmp % 2 != 0 && max % 2 != 0) ) {
            System.out.println((3 * max - tmp) / 2);
        } else  {
            int diff = (3 * (max+1) - tmp)/2;
            System.out.println(diff);
        }
    }
}
