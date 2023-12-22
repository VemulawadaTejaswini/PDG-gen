import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int t = in.nextInt();
        int s = in.nextInt();
        double time = (double)d / s;
        if (time - t > 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
