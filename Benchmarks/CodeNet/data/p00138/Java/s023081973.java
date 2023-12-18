import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Double, Integer> h = new TreeMap<>();
        int c;
        for (int i = 0; i < 3; i++) {
            Map<Double, Integer> m = new TreeMap<>();
            for (int j = 0; j < 8; j++) {
                int n = sc.nextInt();
                double t = sc.nextDouble();
                m.put(t, n);
            }
            c = 0;
            for (Entry<Double, Integer> entry : m.entrySet()) {
                if (c++ < 2) {
                    System.out.println(entry.getValue() + " " + entry.getKey());
                } else if (c < 4) {
                    h.put(entry.getKey(), entry.getValue());
                }else {
                    break;
                }
            }
        }
        c=0;
        for (Entry<Double, Integer> entry : h.entrySet()) {
            if (c++ < 2)
                System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
