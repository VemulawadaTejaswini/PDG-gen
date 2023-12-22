import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i<n; i++) {
            t[i] = Math.abs(sc.nextInt());
            a[i] = Math.abs(sc.nextInt());
            if(i>0) a[i] = Math.abs(a[i] - a[i-1]);
            b[i] = sc.nextInt();
            if(i>0) b[i] = Math.abs(b[i] - b[i-1]);
            if(i>0) t[i] = Math.abs(t[i] - t[i-1]);
        }
        for(int i = 0; i<n; i++) {
            //System.out.println(i);
            if(a[i]+b[i] > t[i]) {
                System.out.println("No");
                return;
            }
            if((a[i]+b[i])%2==t[i]%2) continue;
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;

    }
}