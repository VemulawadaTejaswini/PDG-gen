import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n, m;
            while((n = scn.nextInt()) > 0 | (m = scn.nextInt()) > 0) {
                int[] fld = new int[n];
                for(int i = 0; i < n; i++) {
                    fld[i] = scn.nextInt();
                }
                int pt = 0, cnt = 0;
                try {
                    while(m-- > 0) {
                        cnt++;
                        pt += scn.nextInt();
                        pt += fld[pt];
                        if(-~pt >= n) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                } catch(ArrayIndexOutOfBoundsException e) {
                    while(m-- > 0) {
                        scn.nextInt();
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}