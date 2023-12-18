import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int sec = s % 60;
        int min = (s / 60) % 60;
        int hou = (s / 60) / 60;

        System.out.printf("%d:%d:%d\n", hou, min, sec);
    }
}

