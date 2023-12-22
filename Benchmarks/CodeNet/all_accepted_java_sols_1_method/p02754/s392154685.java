import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long n = Long.parseLong(values[0]);
        long a = Long.parseLong(values[1]);
        long b = Long.parseLong(values[2]);
        long ta = n % (a + b);
        long tb = n / (a + b);
        long tc = 0;
        if (ta >= a) {
            tc = a;
        } else {
            tc = ta;
        }
        System.out.println(((tb * a) + tc));
    }
}