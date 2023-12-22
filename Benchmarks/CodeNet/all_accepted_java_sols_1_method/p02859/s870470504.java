import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextByte();

        int area = r*r*3;
        System.out.println(area /3);
    }
}
