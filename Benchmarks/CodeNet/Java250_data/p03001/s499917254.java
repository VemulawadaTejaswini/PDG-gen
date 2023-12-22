import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();
        String ans = ((long) w * h / 2.0) + " " + (x * 2 == w && y * 2 == h ? 1 : 0);
        System.out.println(ans);
    }
}