import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i =0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        long num1 = 0;
        long tmp1 = 0;
        //+-+-
        for(int i=0; i<n; i++) {
            tmp1 += a[i];
            if(i % 2 == 0) {
                if(tmp1 <= 0) {
                    num1 += Math.abs(tmp1) + 1;
                    tmp1 += Math.abs(tmp1) + 1;
                }
            } else {
                if(tmp1 >= 0) {
                    num1 += Math.abs(tmp1) + 1;
                    tmp1 -= Math.abs(tmp1) + 1;
                }
            }
        }

        long num2 = 0;
        long tmp2 = 0;
        //-+-+
        for(int i=0; i<n; i++) {
            tmp2 += a[i];
            if(i % 2 == 0) {
                if(tmp2 >= 0) {
                    num2 += Math.abs(tmp2) + 1;
                    tmp2 -= Math.abs(tmp2) + 1;
                }
            } else {
                if(tmp2 <= 0) {
                    num2 += Math.abs(tmp2) + 1;
                    tmp2 += Math.abs(tmp2) + 1;
                }
            }
        }
        System.out.println(Math.min(num1,num2));
    }
}
