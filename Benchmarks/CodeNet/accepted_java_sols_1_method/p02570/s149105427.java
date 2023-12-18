import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        String ans = "";

        float x = (float)d / (float)s;
        if (x <= (float)t) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}