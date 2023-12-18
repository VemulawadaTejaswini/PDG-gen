import java.util.*;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {
    public static void main(String[] args) {
        /*
        n: 5
        S: 1 2 3 4 5 
        q: 3
        T: 3 4 1
        out: 3
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < q; i++) {
            if(search(sc.nextInt(),n,s))ans++;;
        }
        System.out.println(ans);
    }
    
    static boolean search(int key, int n, int[] s) {
        //iは要素の半分、key以下だったらi-1をさらにその半分、以上だったらn+i/2
        //5 ・・・ 2 
        int left = 0;
        int right = n;
        int mid;
        while (left < right) {
            mid = (int) Math.floor((right + left) / 2.0);
            if (s[mid] == key) {
                return true;
            } else if (key < s[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
