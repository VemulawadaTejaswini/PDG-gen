import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = Integer.parseInt(sc.next());
        int h = time / 60 / 60;
        int m = time / 60 % 60;
        int s = time % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
