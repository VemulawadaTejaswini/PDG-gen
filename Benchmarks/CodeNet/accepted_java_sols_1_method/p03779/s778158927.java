import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long count = 0l;
        long sum = 0l;
        while(sum < x) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}