import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        int power = 0;
        while (X <= Y) {
            Y = Y / 2;
            power++;
        }
        System.out.println(power);
    }
}