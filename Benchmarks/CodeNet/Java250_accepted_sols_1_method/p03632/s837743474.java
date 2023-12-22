import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int aStart = Integer.parseInt(sc.next());
        int aEnd = Integer.parseInt(sc.next());
        int bStart = Integer.parseInt(sc.next());
        int bEnd = Integer.parseInt(sc.next());
        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);
        int intersection = Math.max(0, end - start);
        System.out.println(intersection);
    }
}
