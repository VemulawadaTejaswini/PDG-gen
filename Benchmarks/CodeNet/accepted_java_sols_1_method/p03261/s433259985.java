import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        boolean flg = true;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (s[i].equals(s[j])) flg = false;
            }
        }
        for (int i = 0 ; i < n - 1 ; i++) {
            if (s[i].charAt(s[i].length() - 1) != s[i + 1].charAt(0)) flg = false;
        }
        System.out.println(flg ? "Yes" : "No");
    }

}