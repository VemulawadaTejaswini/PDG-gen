import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        boolean has1 = false;
        int nex = 1;
        for (int i = 0; i < n; i++) {
            if(a[i] == nex){
                nex++;
                if(a[i] == 1) has1 = true;
            }else{
                ans++;
            }
        }
        if(has1) System.out.println(ans);
        else System.out.println(-1);
        sc.close();

    }

}
