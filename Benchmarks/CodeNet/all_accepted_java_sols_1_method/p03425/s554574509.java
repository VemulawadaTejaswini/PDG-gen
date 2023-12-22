import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        int h = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s.substring(0, 1)) {
                case "M":
                    m++;
                    break;
                case "A":
                    a++;
                    break;
                case "R":
                    r++;
                    break;
                case "C":
                    c++;
                    break;
                case "H":
                    h++;
                    break;
            }
        }

        long ans = 0;

        for (int i = 7; i <= 28; i++) {
            if (Integer.bitCount(i) == 3) {
                long count = 1;
                int value = Integer.lowestOneBit(i);
                int left = i;
                for (int j = 0; j < 3; j++) {
                    switch (value) {
                        case 1:
                            count *= h;
                            break;
                        case 2:
                            count *= c;
                            break;
                        case 4:
                            count *= r;
                            break;
                        case 8:
                            count *= a;
                            break;
                        case 16:
                            count *= m;
                            break;
                    }
                    left -= value;
                    value = Integer.lowestOneBit(left);
                }
                ans += count;
            }
        }

        System.out.println(ans);
    }
}