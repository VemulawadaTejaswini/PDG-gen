import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int turn1 = (int)Math.ceil(c / (double)b);
        int turn2 = (int)Math.ceil(a / (double)d);
        System.out.println(turn1<=turn2 ? "Yes" : "No");
    }
}
