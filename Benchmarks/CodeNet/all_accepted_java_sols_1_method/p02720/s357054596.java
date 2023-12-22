import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        StringBuilder[] res = new StringBuilder[100005];
        for (int i = 1; i <= 9; i++) {
            res[i] = new StringBuilder().append(i);
        }
        int size = 9;
        for(int start = 1; ; ++start) {
            StringBuilder s = res[start];
            char c = s.charAt(s.length() - 1);
            if (c == '0') {
                res[++size] = new StringBuilder(s).append('0');
                res[++size] = new StringBuilder(s).append('1');
            } else if (c < '9') {
                res[++size] = new StringBuilder(s).append((char)(c - 1));
                res[++size] = new StringBuilder(s).append(c);
                res[++size] = new StringBuilder(s).append((char)(c + 1));
            } else {
                res[++size] = new StringBuilder(s).append('8');
                res[++size] = new StringBuilder(s).append('9');
            }
            if (size >= k) break;
        }
        System.out.println(res[k].toString());
    }
}
