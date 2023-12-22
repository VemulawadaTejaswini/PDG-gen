import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int h = S/(60*60);
        S -= h*60*60;
        int m = S/60;
        int s = S%60;
        System.out.println(h + ":" + m + ":" + s);
    }
}