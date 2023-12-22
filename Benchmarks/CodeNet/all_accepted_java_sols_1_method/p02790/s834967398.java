import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = sc.nextInt();
        Integer b = sc.nextInt();

        String stra = String.valueOf(a);
        String strb = String.valueOf(b);

        String c = "";
        String d = "";

        for (int j = 0; j < b; j++) {
            c += stra;
        }

        for (int j = 0; j < a; j++) {
            d += strb;
        }

        int intc = Integer.parseInt(c);
        int intd = Integer.parseInt(d);

        if (a < b) {
            System.out.println(intc);
        } else {
            System.out.println(intd);
        }

    }

}