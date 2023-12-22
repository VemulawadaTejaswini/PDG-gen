import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        sc.close();

        long firstDivisible;
        if(a % x == 0){
            firstDivisible = a;
        }else{
            firstDivisible = a + x - (a % x);
        }

        long lastDivisible = b - (b % x);
        if(b % x == 0){
            lastDivisible = b;
        }else{
            lastDivisible = b - (b % x);
        }

        long count = 0L;
        if(firstDivisible <= lastDivisible){
            count = (lastDivisible - firstDivisible) / x + 1;
        }
        System.out.println(count);
    }

}
