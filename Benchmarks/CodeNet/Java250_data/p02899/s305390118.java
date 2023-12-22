import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) in[i] = sc.nextInt();
        sc.close();

        for(int i=0; i < n; i++) ans[in[i] - 1] = i+1;

        StringBuilder sb = new StringBuilder();
        sb.append(ans[0]);

        for(int i = 1; i < ans.length; i++) sb.append(" ").append(ans[i]);
        System.out.println(sb.toString());
    }
}
