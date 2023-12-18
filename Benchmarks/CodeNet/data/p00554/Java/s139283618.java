import java.util.Arrays;
import java.util.Scanner;

//0631
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l[] = new int[m], a = 0;
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            sc.nextInt();
        }
        Arrays.sort(l);
        for (int i = m - 1; i > 0; i--) {
            a += l[i] < n ? n - l[i] : 0;
        }
        System.out.println(a);
    }
}

