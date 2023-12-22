import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] c = new int[n-1];
        int[] s = new int[n-1];
        int[] f = new int[n-1];
        for(int i=0; i<n-1; i++) {
            c[i] = Integer.parseInt(sc.next());
            s[i] = Integer.parseInt(sc.next());
            f[i] = Integer.parseInt(sc.next());
        }
        int[] t = new int[n-1];
        for(int i=0; i<n-1; i++) {
            t[i] = s[i]+c[i];
            for(int j=i+1; j<n-1; j++) {
                if(t[i] < s[j]) t[i] = s[j] + c[j];
                else {
                    int k = 0;
                    while(true) {
                        if(t[i] <= s[j]+f[j]*k) {
                            t[i] = s[j]+f[j]*k+c[j];
                            break;
                        }
                        k++;
                    }
                }
            }
            System.out.println(t[i]);
        }
        System.out.println(0);
    }

}
