import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int[] p = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int pn = 15;

        int[] a = new int[15];
        int n = sc.nextInt();
        int res = 0;

        for(int i=2; i<=n; i++) {
            int d = i;
            for(int j=0; j<pn; j++) {
                while(d % p[j] == 0) {
                    a[j]++;
                    d /= p[j];
                }
            }
        }

        int a3 = 0;
        int a5 = 0;
        int a15 = 0;
        int a25 = 0;
        int a75 = 0;

        for(int i=0; i<pn; i++) {
            if(a[i] >= 74) a75++;
            if(a[i] >= 24) a25++;
            if(a[i] >= 14) a15++;
            if(a[i] >= 4) a5++;
            if(a[i] >= 2) a3++;
        }

        res += a75;
        res += a25 * (a3 - 1);
        res += a15 * (a5 - 1);
        res += (a5 * (a5-1) / 2) * (a3 - 2);
        System.out.println(res);

    }


}
