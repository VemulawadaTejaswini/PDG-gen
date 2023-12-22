import java.util.*;
import java.text.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        // this got WA
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("" + (a/b) + " " + (a%b) + " " + (a/(double)b));

        // this is OK
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);

        System.out.println("" + (a/b) + " " + (a%b) + " " + format.format(a/(double)b));

        // this is also OK
        // long a = sc.nextInt();
        // long b = sc.nextInt();
        // long a00000 = a * 100000;
        // long c = a00000 / b;
        // long d = c / 100000;
        // long f = c % 100000;
        // String sf = ""+f;
        // while(sf.length() < 5) sf = "0" + sf;
        // System.out.println("" + (a/b) + " " + (a%b) + " " + d + "." + sf);
    }
}