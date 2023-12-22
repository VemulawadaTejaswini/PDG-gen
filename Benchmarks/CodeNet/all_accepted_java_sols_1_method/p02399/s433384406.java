import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        
        int d = Integer.parseInt(x) / Integer.parseInt(y);
        int r = Integer.parseInt(x) % Integer.parseInt(y);
        double f = Double.parseDouble(x) / Double.parseDouble(y);
        
        System.out.printf("%d" + " " + "%d" + " " + "%.5f", d, r , f);
    }
}
