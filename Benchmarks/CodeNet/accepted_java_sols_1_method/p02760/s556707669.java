import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int n = in.nextInt();
        Set<Integer> b = new HashSet<>(n);
        for(int i=0; i<n; i++) {
            b.add(in.nextInt());
        }
        boolean isBingo = false;

        // よこ
        for(int i=0; i<3; i++) {
            if(isBingo) {
                break;
            }
            boolean localBingo = true;
            for(int j=0; j<3; j++) {
                if(!b.contains(a[i][j])) {
                    localBingo = false;
                    break;
                }
            }
            if(localBingo) {
                isBingo = true;
            }
        }
        // たて
        for(int i=0; i<3; i++) {
            if(isBingo) {
                break;
            }
            boolean localBingo = true;
            for(int j=0; j<3; j++) {
                if(!b.contains(a[j][i])) {
                    localBingo = false;
                    break;
                }
            }
            if(localBingo) {
                isBingo = true;
            }
        }
        // ななめ
        if(
            (b.contains(a[0][0]) && b.contains(a[1][1]) && b.contains(a[2][2]))
            || (b.contains(a[0][2]) && b.contains(a[1][1]) && b.contains(a[2][0]))
        ) {
            isBingo = true;
        }
        System.out.println(isBingo?"Yes":"No");
    }
}
