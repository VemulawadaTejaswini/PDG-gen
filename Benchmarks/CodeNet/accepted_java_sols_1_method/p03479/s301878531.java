import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long res = 1;
        long total = X;
        while(total <= Y) {
            res++;
            total *= 2;
        }
        res--;
        System.out.println(res);
    }
}