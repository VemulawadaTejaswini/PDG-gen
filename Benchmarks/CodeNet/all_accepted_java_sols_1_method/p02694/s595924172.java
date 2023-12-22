import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long mon = 100;
        long year = 1;
        while ((mon += mon * 0.01) < X) {
            year++;
        }
        System.out.println(year);
    }
}