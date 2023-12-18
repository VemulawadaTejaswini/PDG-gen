import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int b;
        if ((w==x+x) && (h==y+y)) b=1;
        else b = 0;
        System.out.println(String.format("%.6f", (double)w*(double)h/2)+" "+b);
    }
}