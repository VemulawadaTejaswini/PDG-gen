import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                boolean flg = true;
                for (int k = i ; k <= j ; k++) {
                    if (s[k] != 'A' && s[k] != 'T' && s[k] != 'C' && s[k] != 'G') flg = false;
                }
                if (flg) max = Math.max(max, j - i + 1);
            }
        }
        System.out.println(max);

    }

}
