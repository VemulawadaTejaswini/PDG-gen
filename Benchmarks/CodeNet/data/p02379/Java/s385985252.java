import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
        DecimalFormat df = new DecimalFormat("0.00000000");
        
        double x1 = Double.parseDouble(sc.next());
        double y1 = Double.parseDouble(sc.next());
        double x2 = Double.parseDouble(sc.next());
        double y2 = Double.parseDouble(sc.next());
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        out.println(df.format(distance));
        out.flush();
    }
}
