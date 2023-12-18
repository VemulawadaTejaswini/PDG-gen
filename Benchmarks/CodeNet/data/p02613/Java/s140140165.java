import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] str = { "AC", "WA", "TLE", "RE" };
        int n;
        int count[] = new int[4];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals(str[0])) {
                count[0]++;
            } else if (s.equals(str[1])) {
                count[1]++;
            } else if (s.equals(str[2])) {
                count[2]++;
            } else {
                count[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%s x %d\n", str[i], count[i]);
        }
    }
}