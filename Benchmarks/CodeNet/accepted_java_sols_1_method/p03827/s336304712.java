import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                count++;
                ans = Math.max(ans, count);
            } else {
                count--;
            }
        }
        System.out.println(ans);
    }
}