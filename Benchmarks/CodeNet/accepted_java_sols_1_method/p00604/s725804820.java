import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt(), l[] = new int[n], s = 0;
            for (int i = 0; i < n; i++)
                l[i] = sc.nextInt();
            Arrays.sort(l);
            for (int i = 0; i < n; i++)
                s += l[i] * (n - i);
            System.out.println(s);
        }
    }
}
