import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int t = in.nextInt();
        int result = (int)(b*Math.floor((t+0.5)/a));
        System.out.println(result);
    }
}
