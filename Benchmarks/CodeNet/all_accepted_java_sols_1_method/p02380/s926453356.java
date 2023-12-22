import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat fmt = new DecimalFormat("0.########");
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final double a = Double.parseDouble(sc.next());
        final double b = Double.parseDouble(sc.next());
        final double c = Double.parseDouble(sc.next())* (Math.PI/180);
        out.println(fmt.format(0.5*a*b*Math.sin(c)));
        out.println(fmt.format(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c))));
        out.println(fmt.format(b*Math.sin(c)));
        out.flush();
    }
}