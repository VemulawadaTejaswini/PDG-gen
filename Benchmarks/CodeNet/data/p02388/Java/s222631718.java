import static java.lang.Double.parseDouble;

public class Main {
    public static void main (String[] args ) {
        int i ;
        i = (int) xclubic(parseDouble(args[0]));
        System.out.println(i);
    }
    public static double xclubic (double x) {
        double y;
        y = 3;
        return Math.pow(x , y);
    }
}