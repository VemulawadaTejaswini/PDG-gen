import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long count = 0;
        long count2 = 1;
        while (H != 0) {
            count += count2;
            count2 *= 2;
            H /= 2;
        }

        System.out.println(count);
    }
}