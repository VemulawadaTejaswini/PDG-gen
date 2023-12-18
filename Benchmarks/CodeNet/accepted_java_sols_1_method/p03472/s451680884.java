import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        Arrays.sort(b);
        int max = Arrays.stream(a).max().getAsInt();
        int attacks = (int) Math.ceil(h*1.0/max);
        int minAttacks = attacks;
        int reduce = 0;
        int bAttacks = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            reduce += b[i];
            bAttacks++;
            if (h < reduce){
                if (bAttacks < minAttacks) minAttacks = bAttacks;
                break;
            }
            attacks = (int) Math.ceil((h -  reduce)*1.0/max);
            if (attacks + bAttacks < minAttacks) minAttacks = attacks + bAttacks;
        }

        System.out.println(minAttacks);
    }
}
