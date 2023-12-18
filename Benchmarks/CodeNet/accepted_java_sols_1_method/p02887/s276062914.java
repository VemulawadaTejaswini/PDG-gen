import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int ans = n;
        for(int i = 0; i < n - 1 ; i++) if(S[i] == S[i + 1]) ans--;
        System.out.println(ans);
    }
}