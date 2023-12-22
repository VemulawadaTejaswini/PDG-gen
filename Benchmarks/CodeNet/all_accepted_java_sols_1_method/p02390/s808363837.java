import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int h, m, s;

        s = S % 60;
        S = (S - s) / 60;
        m = S % 60;
        S = (S - m) / 60;
        h = S;

        System.out.println(h + ":" +m + ":" + s);
    }
}

