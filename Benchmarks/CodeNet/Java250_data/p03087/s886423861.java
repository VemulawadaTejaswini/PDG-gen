import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
 
        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next()); // 未使用となる変数n
        Integer q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
 
        // 主処理
        int[] count = new int[n];
        count[0] = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'A') {
                count[i] = count[i-1] + 1;
            } else {
                count[i] = count[i-1];
            }
        }
        String[] str = new String[q];
        for (int i = 0; i < q; i++) {
            int num = count[r[i] - 1] - count[l[i] - 1];
            str[i] = Integer.toString(num);
        }
 
        // 出力
        System.out.println(String.join("\r\n", str));
        sc.close();
    }
}