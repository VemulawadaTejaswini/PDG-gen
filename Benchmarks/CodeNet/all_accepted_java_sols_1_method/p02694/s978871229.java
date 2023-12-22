import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long total = 100;
        int count = 0;
        while(total < k) {
            total *= 1.01;
            count++;
        }
        System.out.println(count);
    }
}