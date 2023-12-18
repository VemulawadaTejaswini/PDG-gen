import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int m = s / 60;
        s %= 60;
        int h = s / 60;
        s %= 60;

        System.out.printf("%d:%d:%d",h,m,s);
        System.out.println();

    }
}

