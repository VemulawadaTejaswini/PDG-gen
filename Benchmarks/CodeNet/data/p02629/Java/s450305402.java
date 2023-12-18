import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String ans = "";
        long a = sc.nextInt();
        Long z = a;
        String[] array = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        int b = 0;
        while(z > 0){
            z /= 26;
            b++;
        }
        String x[] = new String[b];
        for (int i = b-1; i >= 0; i--) {
            long c = a % 26;
            x[i]= array[(int)c-1];
            a /= 26;
        }
        for (String s : x) {
            ans += s;
        }
        System.out.println(ans);
    }
}






