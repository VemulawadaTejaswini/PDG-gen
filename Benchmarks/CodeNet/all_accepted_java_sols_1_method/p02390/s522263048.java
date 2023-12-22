import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        int h = input / 3600;
        input = input % 3600;
        int m = input / 60;
        input = input % 60;
        int s = input;
        System.out.println(h+":"+m+":"+s);
    }
}

