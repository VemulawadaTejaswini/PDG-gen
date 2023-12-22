import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        String a = s.substring(0, 1);
        String c = s.substring(2, s.length() - 1);
        String rep = s.replaceAll("A", "");
        rep = rep.replaceAll("C", "");

        boolean flg = true;

        if (!a.equals("A")) {
            flg = false;
        }

        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flg = false;
        }

        String low = rep.toLowerCase();
        if (!rep.equals(low)) {
            flg = false;
        }

        if (flg) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}