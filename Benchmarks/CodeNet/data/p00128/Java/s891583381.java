import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean r = false;
        while (sc.hasNext()) {
            String l = sc.next();
            while (l.length() < 5) {
                l = "0" + l;
            }
            if (r) {
                System.out.println();
            }
            r = true;
            boolean f=true;
            for (int i = 0; i < 8; i++) {
                if (i < 2) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print((l.charAt(j) < '5' == f ? "*" : " ") + (j == 4 ? "\n" : ""));
                    }
                    f = false;
                } else if (i == 2) {
                    System.out.println("=====");
                } else {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(((l.charAt(j) - '0') % 5 == i - 3 ? " " : "*") + (j == 4 ? "\n" : ""));
                    }
                }
            }
        }
    }
}

