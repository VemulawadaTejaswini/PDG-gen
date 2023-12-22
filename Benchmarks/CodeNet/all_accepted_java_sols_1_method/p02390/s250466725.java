import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int h, m, s;
        h = sum/3600;
        m = (sum%3600)/60;
        s = (sum%3600)%60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
