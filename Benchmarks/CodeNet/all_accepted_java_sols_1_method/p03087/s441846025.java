import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] sum = new int[n];
        boolean a = s[0] == 'A';
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i -1];
            if(s[i] == 'A'){
                a = true;
                continue;
            }
            if(s[i] == 'C' && a) sum[i]++;
            a = false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() -1;
            int r = sc.nextInt() -1;
            sb.append(sum[r] - sum[l]).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
