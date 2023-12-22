import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int res = 0;
        int p = 0;
        for(int i=1; i<n; i++) {
            if(a[i-1]>=a[i]) {
                p++;
                res = Math.max(res, p);
            } else {
                p = 0;
            }
        }
        System.out.println(res);


    }

}
