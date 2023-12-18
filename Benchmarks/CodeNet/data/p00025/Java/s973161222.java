import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            int[] a = createArray(), b = createArray();
            System.out.println(searchHit(a, b) + " " + searchBlow(a, b));
        }
    }
    
    private static int[] createArray() {
        int[] ary = new int[4];
        for(int i = 0; i < 4; i++) {
            ary[i] = scn.nextInt();
        }
        return ary;
    }
    
    private static int searchHit(int[] a, int[] b) {
        int hit = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == b[i]) {
                hit++;
            }
        }
        return hit;
    }
    
    private static int searchBlow(int[] a, int[] b) {
        int blow = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(i != j && a[i] == b[j]) {
                    blow++;
                }
            }
        }
        return blow;
    }
}