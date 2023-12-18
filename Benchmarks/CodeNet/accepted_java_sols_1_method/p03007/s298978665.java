import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long total = 0;

        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            total += Math.abs(a[i]);
        }

        Arrays.sort(a);
////        for(long i : a) {
////            System.out.print(i+ " ");
////        }
//        System.out.println();

        int cnt = 0;
        for(int i = 0; i<n; i++) {
            if(a[i]>=0) break;
            cnt++;
        }
        if(cnt == 0 ) {
            System.out.println(total-a[0]*2);
            System.out.println(a[0] +" "+ a[1]);
            a[1] = a[0]-a[1];
            for(int i = 1; i<n-2; i++) {
                System.out.println(a[i] +" "+ a[i+1]);
                a[i+1] = a[i] - a[i+1];
            }
            if(n!=2) System.out.println(a[n-1]+" "+a[n-2]);
            return;
        }
        if(cnt == n) {
            System.out.println(total+a[n-1]*2);
            System.out.println(a[n-1] +" "+ a[n-2]);
            a[n-2] = a[n-1]-a[n-2];
            for(int i = n-2; i>0; i--) {
                System.out.println(a[i] +" "+ a[i-1]);
                a[i-1] = a[i] - a[i-1];
            }
            return;
        }
        int minus = cnt;
        int plus = n-cnt;
        int left = 0;
        int right = n-1;
        System.out.println(total);
        for(int i = 0; i<n-1; i++) {
            if(minus<plus) {
                System.out.println(a[left] + " " + a[right]);

                plus--;
                a[left] = a[left]-a[right];
                right--;
            }
            else {
                System.out.println(a[right] + " " + a[left]);
                minus--;
                a[right] = a[right]-a[left];
                left++;
            }
        }


    }

}