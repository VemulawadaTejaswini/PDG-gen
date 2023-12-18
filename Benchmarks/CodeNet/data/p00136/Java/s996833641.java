import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        printArray(createArray(scn.nextInt()));
    }
    
    public static int[] createArray(int n) {
        int[] ary = new int[6];
        for(int i = 0; i < n; i++) {
            int idx = ((int)scn.nextDouble() - 160) / 5;
            ary[idx > 0 ? (idx < 5 ? idx : 5) : 0]++;
        }
        return ary;
    }
    
    public static void printArray(int[] ary) {
        for(int i = 0; i < 6; i++) {
            StringBuilder sb = new StringBuilder(i + 1 + ":");
            for(int j = 0; j < ary[i]; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}