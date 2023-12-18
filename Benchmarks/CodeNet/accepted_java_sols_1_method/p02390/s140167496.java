import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        if (S >= 0 && S <= 86400) {
            int h = S / 3600;
            int m = (S % 3600) / 60;
            int s = (S % 3600) % 60;
            System.out.println(h + ":" + m + ":" + s);
        }
    }
}
