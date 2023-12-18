import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextLong();
        sc.close();
        System.out.println(max(a));
    }

    private static long max(long[] a){
        long max,ma = -1,l = a.length;
        int in = 0;
        for(int i = 1;i < l;i++){
            if(ma < a[i]){
                ma = a[i];
                in = i;
            }
        }
        max = ma - a[0];
        for(int i = 1;i < l - 1;i++){
            if(i == in){
                ma = -1;
                for(int j = in + 1;j < l;j++){
                    if(ma < a[j]){
                        ma = a[j];
                        in = j;
                    }
                }
            }
            if(max < ma - a[i]) max = ma - a[i];
        }
        return max;
    }

}