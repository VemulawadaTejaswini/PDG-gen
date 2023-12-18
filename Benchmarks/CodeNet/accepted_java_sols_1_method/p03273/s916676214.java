import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String... args) {
        Scanner IN   = new Scanner(System.in);
        int H = IN.nextInt();
        int W = IN.nextInt();
        ArrayList<String> a = new ArrayList<String>();
        int b[] = new int[W];
        for (int i = 0; i < H; i++) {
            String x = IN.next();
            if (x.indexOf("#") >= 0) {
                a.add(x);
                for (int j = 0; j < W; j++) {
                    if (x.charAt(j) == '#') {
                        b[j]++;
                    }
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < W; j++) {
                if (b[j] > 0) {
                    System.out.print(a.get(i).charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
