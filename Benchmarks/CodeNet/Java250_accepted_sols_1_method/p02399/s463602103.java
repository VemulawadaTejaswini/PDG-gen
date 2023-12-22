import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.########");
    public static void main(String[] Args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(a/b+" "+a%b+" "+df.format((double) a/b));
    }
}