import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for (int i = 0; i < n; i++) {
            Double x1 = Double.parseDouble(sc.next());
            Double y1 = Double.parseDouble(sc.next());
            Double x2 = Double.parseDouble(sc.next());
            Double y2 = Double.parseDouble(sc.next());
            Double x3 = Double.parseDouble(sc.next());
            Double y3 = Double.parseDouble(sc.next());

            double px, py, r;

            px = ((2*(y2-y1))*(Math.pow(x1, 2)-Math.pow(x3,2)+Math.pow(y1,2)-Math.pow(y3,2))-(2*(y3-y1))*(Math.pow(x1,2)-Math.pow(x2,2)+Math.pow(y1,2)-Math.pow(y2,2)))
                    /((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));

            py = ((Math.pow(x1,2)-Math.pow(x2,2)+Math.pow(y1,2)-Math.pow(y2,2))*(2*(x3-x1))-(Math.pow(x1,2)-Math.pow(x3,2)+Math.pow(y1,2)-Math.pow(y3,2))*(2*(x2-x1)))
                    /((2*(x2-x1))*(2*(y3-y1))-(2*(x3-x1))*(2*(y2-y1)));
            r = Math.sqrt((Math.pow(px-x1,2))+(Math.pow(py-y1,2)));

            px *= 1000;
            px = Math.round(px);
            px /= 1000;
            
            py *= 1000;
            py = Math.round(py);
            py /= 1000;
            
            r *= 1000;
            r = Math.round(r);
            r /= 1000;

            System.out.printf("%.3f %.3f %.3f\n", px, py, r);
        }
    }
}