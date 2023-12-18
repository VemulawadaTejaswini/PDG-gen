import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X =  scanner.nextLong();
        long deposit = 100;
        int count = 0;

        while(deposit < X) {
            deposit *= 1.01;
            count++;
        }

        System.out.println(count);
    }
}
