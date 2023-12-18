import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();

        sc.close();

        int[] arr = new int[26];

        for (int i = 0; i < w.length(); i++) {
            arr[w.charAt(i) - 'a']++;
        }

        boolean flg = true;

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                flg = false;
            }
        }

        System.out.println(flg ? "Yes" : "No");

    }
}