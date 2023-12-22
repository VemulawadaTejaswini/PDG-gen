import static java.lang.Double.parseDouble;

public class Main {
    public static void main (String[] args ) {
        int i ;
        String number = new java.util.Scanner ( System.in ).nextLine();
        i = (int) xclubic (parseDouble(number));
        System.out.println(i);
    }
    public static double xclubic (double x) {
        double y;
        y = 3;
        return Math.pow(x , y);
    }
}