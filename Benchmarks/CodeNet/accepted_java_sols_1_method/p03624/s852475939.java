import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int[] a = new int[26];
        for (char c : S.toCharArray()) {
            a[c-97] += 1;
        }
        String answer = "None";
        for (int i = 0; i < 26;i++) {
            if (a[i] == 0) {
                answer = Character.toString((char) (i+97));
                break;
            }
        }
        System.out.println(answer);
    }
}
