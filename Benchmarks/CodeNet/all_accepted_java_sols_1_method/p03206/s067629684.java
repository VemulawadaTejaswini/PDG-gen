import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String ans = "a";
        if (d == 24) {
            ans = "Christmas Eve";
        } else if (d == 22) {
            ans = "Christmas Eve Eve Eve";
        } else if (d == 25) {
            ans = "Christmas";
        } else {
            ans = "Christmas Eve Eve";
        }
        System.out.println(ans);
    }
}