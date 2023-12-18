import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        System.out.println(String.format("%.6f", a * a * 3.141592653589) + " " + String.format("%.6f", a * 2 * 3.141592653589));
    }
}
