import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(S[i]);
            sb.append(T[i]);
        }
        System.out.println(sb.toString());
    }
}
