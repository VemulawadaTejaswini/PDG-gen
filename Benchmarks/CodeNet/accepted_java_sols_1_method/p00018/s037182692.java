import java.util.Stack;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static void main(String[] args) throws Exception {
        int[] ary = new int[5];
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (ary[j] < ary[j+1]) {
                    int t = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = t;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(ary[i]).append(" ");
        }
        sb.delete(sb.length()-1,sb.length());
        System.out.println(sb.toString());
    }
}