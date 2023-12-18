
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        int[] a = new int[cs.length];
        int count = 0;
        int f = 0;
        for (int i = 0 ; i < cs.length ; i++) {
            if (f== 0) {
                if (cs[i] == 'A' ||cs[i] == 'T' || cs[i] == 'G' ||cs[i] == 'C') {
                    a[i] = 1;
                    count = 1;
                    f = 1;
                }
            } else {
                if (cs[i] == 'A' ||cs[i] == 'T' || cs[i] == 'G' ||cs[i] == 'C') {
                    count++;
                    a[i] = count;
                } else {
                    count = 0;
                    f = 0;
                }
            }

        }
        int max = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            max = Math.max(max, a[i]);
        }
        System.out.println(max);
    }

}