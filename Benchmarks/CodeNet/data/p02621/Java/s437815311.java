import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        long num = c.nextInt();
        System.out.println((num + (num * num) + (num * num * num)));

    }

}