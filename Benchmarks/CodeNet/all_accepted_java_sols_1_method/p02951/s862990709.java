import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int remainder = a - b;
        // 容器1の空き容量が0の場合、容器2の水は移動できない
        if (remainder == 0) {
            System.out.println(c);
        } else {
            System.out.println(Math.max(c - remainder, 0));
        }
        sc.close();
    }
}