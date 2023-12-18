import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();

        int tmp = 0;
        int max = 0;

        for (int i = 0; i < x.length() - y.length() + 1; i++) {
            for (int j = 0; j < y.length(); j++) {
                if (x.charAt(j + i) == y.charAt(j)) {
                    tmp++;
                    if (tmp > max) {
                        max = tmp;
                    }
                }
            }
            tmp = 0;
        }

            System.out.println(y.length() - max);



        sc.close();

        }

    }

