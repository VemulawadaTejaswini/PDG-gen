import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        char[] t = sc.next().toCharArray();

        int q = n / k + 1;

        int point = 0;

        int g = 2;
        for (int i = 0 ; i < k ; i++) {
            char c = t[i];
            for (int j = 0 ; (j + 1) * k + i < n ; j++) {
                if (t[j * k + i] == t[(j + 1) * k + i]) {
                    g++;
                } else {
                    if (c == 'r') {
                        point += (g / 2) * p;
                    } else if (c == 's') {
                        point += (g / 2) * r;
                    } else {
                        point += (g / 2) * s;
                    }

                    g = 2;
                    c = t[(j + 1) * k + i];
                }
            }
            if (c == 'r') {
                point += (g / 2) * p;
            } else if (c == 's') {
                point += (g / 2) * r;
            } else {
                point += (g / 2) * s;
            }
            g = 2;
        }

        System.out.println(point);

    }

}