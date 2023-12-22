import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        int[] c = new int[26];
        for(char x : s.toCharArray()) {
            c[x-97] += 1;
        }
        boolean found = false;
        for(int i = 0; i < 26; i++) {
            if (1 < c[i]) {
                found = true;
            }
        }
        System.out.println(!found ? "yes" : "no");
    }
}
