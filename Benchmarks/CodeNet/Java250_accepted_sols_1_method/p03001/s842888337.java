import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());
        int isMulti = ((w / 2.0) == x && (h / 2.0) == y) ? 1 : 0;
        System.out.println((w * h / 2.0) + " " + isMulti);
    }
}