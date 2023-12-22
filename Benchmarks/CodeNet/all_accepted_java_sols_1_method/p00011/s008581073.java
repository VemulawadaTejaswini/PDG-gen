import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[w];
        for (int i = 0; i < w; i++) {
            num[i] = i + 1;
        }

        String s;

        for (int i = 0; i < n; i++) {
            s = sc.next();
            int camma_index = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ',') {
                    camma_index = j;
                    break;
                }
            }
            int a = Integer.parseInt(s.substring(0, camma_index));
            int b = Integer.parseInt(s.substring(camma_index+1));
            int tmp = num[a - 1];
            num[a - 1] = num[b - 1];
            num[b - 1] = tmp; // swap
        }

        for (int i = 0; i < w; i++) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}
