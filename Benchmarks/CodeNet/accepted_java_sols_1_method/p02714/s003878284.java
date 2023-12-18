import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        char last = s.charAt(n-1);
        switch(last) {
            case 'R':
                r[n-1]=1;
                break;
            case 'G':
                g[n-1]=1;
                break;
            case 'B':
                b[n-1]=1;
                break;
        }
        for(int i=n-2; i>=0; i--) {
            char c = s.charAt(i);
            r[i] = r[i+1] + (c=='R'?1:0);
            g[i] = g[i+1] + (c=='G'?1:0);
            b[i] = b[i+1] + (c=='B'?1:0);
        }
        long c = 0;
        for(int i=0; i<n-2; i++) {
            char si = s.charAt(i);
            for(int j=i+1; j<n-1; j++) {
                char sj = s.charAt(j);
                if(si==sj) {
                    continue;
                }
                char sk = 'R';
                int[] skArray = r;
                if((si=='R' && sj=='G') || (si=='G' && sj=='R')) {
                    sk = 'B';
                    skArray = b;
                }
                else if((si=='R' && sj=='B') || (si=='B' && sj=='R')) {
                    sk = 'G';
                    skArray = g;
                }
                
                c += skArray[j+1];
                int excludedIndex = j + (j-i);
                if(excludedIndex < n && s.charAt(excludedIndex)==sk) {
                    c--;
                }
            }
        }

        System.out.println(c);
    }
}
