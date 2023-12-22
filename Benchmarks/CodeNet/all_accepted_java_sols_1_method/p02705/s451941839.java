import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        double ans = Math.PI * r * 2;
        System.out.println(ans);
    }
}