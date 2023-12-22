
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int t = 0;
        t = x;
        x = y;
        y = t;
        t = x;
        x = z;
        z = t;
        System.out.println(x+ " "+y+" "+z);
    }
}
