import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        boolean zero = true;
        int cntMiss = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (zero) {
                if (c == '0') {

                } else {
                    cntMiss++;
                }
            } else {
                if (c == '1') {

                } else {
                    cntMiss++;
                }
            }
            zero = !zero;
        }
        int cntMiss2 = 0;
        zero = false;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (zero) {
                if (c == '0') {

                } else {
                    cntMiss2++;
                }
            } else {
                if (c == '1') {

                } else {
                    cntMiss2++;
                }
            }
            zero = !zero;
        }
        if (cntMiss < cntMiss2) {
            System.out.println(cntMiss);
        } else {
            System.out.println(cntMiss2);
        }
        sc.close();

    }
}