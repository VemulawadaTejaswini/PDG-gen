import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;

class Main {
    public static void main (String[] args) throws IOException {
        NumberFormat nf;
        nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        //nf.setMinimumFractionDigits(5);
        nf.setGroupingUsed(false);
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());

        System.out.println(a/b + " " + a%b + " " + nf.format((float)a/b));
    }
}