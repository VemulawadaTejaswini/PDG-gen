import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        int t = 90;

        while (true) {
            String [] line = sc.nextLine().split(",");
            int r = Integer.parseInt(line[0]);
            int dt = Integer.parseInt(line[1]);

            if (r == 0 && dt == 0) break;

            x += r * Math.cos(Math.toRadians(t));
            y += r * Math.sin(Math.toRadians(t));
            t -= dt;

        }

        System.out.println( (int)x );
        System.out.println( (int)y );


    }
}