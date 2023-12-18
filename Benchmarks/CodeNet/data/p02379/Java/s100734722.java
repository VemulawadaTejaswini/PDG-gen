import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat fmt = new DecimalFormat("0.########");
    public static void main(String[] Args) throws IOException{
        final double x1 = Double.parseDouble(sc.next());
        final double y1 = Double.parseDouble(sc.next());
        final double x2 = Double.parseDouble(sc.next());
        final double y2 = Double.parseDouble(sc.next());
        System.out.println(fmt.format(Math.hypot(x2-x1, y2-y1)));
    }
}