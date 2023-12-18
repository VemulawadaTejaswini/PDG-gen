import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int w = scn.nextInt(), n = scn.nextInt();
        int[] ary = createArray(w);
        scn.useDelimiter("\\s+|,");
        for(int i = 0; i < n; i++) {
            swapArray(ary, scn.nextInt() - 1, scn.nextInt() - 1);
        }
        showArray(ary);
    }
    
    private static int[] createArray(int w) {
        int[] ary = new int[w];
        for(int i = 0; i < w; i++) {
            ary[i] = i + 1;
        }
        return ary;
    }
    
    private static void swapArray(int[] ary, int x, int y) {
        ary[x] ^= ary[y];
        ary[y] ^= ary[x];
        ary[x] ^= ary[y];
    }
    
    private static void showArray(int[] ary) {
        for(int elm : ary) {
            System.out.println(elm);
        }
    }
}