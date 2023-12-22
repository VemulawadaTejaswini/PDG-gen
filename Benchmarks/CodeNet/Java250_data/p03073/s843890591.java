import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int[] candidates = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    candidates[0]++;
                } else {
                    candidates[1]++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    candidates[0]++;
                } else {
                    candidates[1]++;
                }
            }
        }
        int ans = Math.min(candidates[0], candidates[1]);
        System.out.println(ans);
    }

}
