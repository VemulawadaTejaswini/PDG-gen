

import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zen = Integer.valueOf(s.substring(0, 2));
        int kou = Integer.valueOf(s.substring(2, 4));
        String res = "AMBIGUOUS";
        if (1 <= zen && zen <= 12 && 1 <= kou && kou <= 12) {
            System.out.println("AMBIGUOUS");
            return;
        }

        if (12 < zen && 12 < kou) {
            System.out.println("NA");
            return;
        }

        if (zen < 0 || kou < 0) {
            System.out.println("NA");
            return;
        }

        if (zen == 0 && kou == 0) {
            System.out.println("NA");
            return;
        }

        if (zen == 0 && 0 < kou && kou <= 12) {
            System.out.println("YYMM");
            return;
        } else if (zen == 0 && 12 < kou) {
            System.out.println("NA");
            return;
        }

        if (kou == 0 && 0 < zen && zen <= 12) {
            System.out.println("MMYY");
            return;
        }else if (kou == 0 && 12 < zen) {
            System.out.println("NA");
            return;
        }

        if (12 < zen) {
            System.out.println("YYMM");
        } else {
            System.out.println("MMYY");
        }
    }
}