import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int r = (int)Math.ceil((float)(b-1) / (float)(a-1));
        System.out.println(r);
    }
}
