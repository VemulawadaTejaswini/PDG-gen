import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().replace('1', 'a').replace('9', '1').replace('a', '9'));
    }
}