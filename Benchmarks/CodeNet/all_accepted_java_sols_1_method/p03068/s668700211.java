import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        int K = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        char c = S.toCharArray()[K-1];
        for(char x : S.toCharArray()) {
            sb.append(x == c ? c : '*');
        }
        System.out.println(sb.toString());
    }
}
