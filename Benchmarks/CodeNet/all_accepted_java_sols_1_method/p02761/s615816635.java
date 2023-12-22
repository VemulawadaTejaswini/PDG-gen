import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        Arrays.fill(a, -1);
        boolean ans = true;
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if(a[s] < 0) a[s] = c;
            else if(a[s] != c) {
                ans = false; break;
            }
        }
        if(ans){
            if(n == 1){
                System.out.println(a[0] < 0 ? 0 : a[0]);
            }else if(n == 2){
                if(a[0] == 0)System.out.println(-1);
                else {
                    int t = a[0] < 0 ? 1 : a[0];
                    t *= 10;
                    t += a[1] < 0 ? 0 : a[1];
                    System.out.println(t);
                }
            }else{
                if(a[0] == 0)System.out.println(-1);
                else{
                    int t = a[0] < 0 ? 100 : a[0]*100;
                    t += a[1] < 0 ? 0 : a[1]*10;
                    t += a[2] < 0 ? 0 : a[2];
                    System.out.println(t);
                }
            }
        }else System.out.println(-1);
        sc.close();

    }

}
