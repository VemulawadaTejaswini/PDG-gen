import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        int count = 0;
        while (Y >= X) {
            Y /= 2;
            count++;
        }
        System.out.println(count);
    }

}