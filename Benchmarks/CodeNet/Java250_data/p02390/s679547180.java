import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        int s = n % 60;
        int tmpM = n / 60;
        int h = tmpM / 60;
        int m = tmpM % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}