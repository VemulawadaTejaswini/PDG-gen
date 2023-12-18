    import java.util.*;
     
    public class Main {
        public static void main(final String[] args) {
            Scanner sc = new Scanner(System.in);
            int w = sc.nextInt();
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
     
            double area = (double) w * h / 2;
            boolean flag = (w == 2 * x) && (h == 2 * y);
            System.out.println(area + " " + (flag ? 1 : 0));
        }
    }