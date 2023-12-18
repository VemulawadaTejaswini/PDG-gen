import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a = h < w ? w : h;

        System.out.println((int)Math.ceil((double)n/a));
        sc.close();

    }

}
