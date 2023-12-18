import java.util.Scanner;
import static java.lang.System.out;

class Watch {
    int second;

    Watch(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        int h = this.second / 3600;
        int m = this.second % 3600 / 60;
        int s = this.second % 60 % 60;
        return String.format("%d:%d:%d", h, m, s);
    }
}

public class Main {
    public static void main(String... args) {
        int s = new Scanner(System.in).nextInt();
        out.println(new Watch(s));
    }
}