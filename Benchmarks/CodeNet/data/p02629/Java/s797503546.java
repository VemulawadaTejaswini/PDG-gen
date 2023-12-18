import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[14];
        char[] b = new char[14];
        for(int i = 0 ; i < 14; i++){
            long tt = 1;
            for(int t = 0 ; t < i ; t++){
                tt = tt * 26;
            }
            if(n > tt){
                a[i] = (n / tt) % 26;
            }else{
                a[i] = -1;
            }
        }
        int ppp = 0;
        int kaz = 13;
        for(int i = 0 ; i < 14 && ppp == 0;i++){
            if(a[i] == -1){
                ppp = 1;
                kaz = i-1;
            }else{
                b[i] = (char)('a' + a[i] - 1);
            }
        }
        for(int i = 0 ; i < kaz; i++){
            System.out.print(b[kaz - i]);
        }
        if(n == 1){
          System.out.println('a');
        }else{
          System.out.println(b[0]);
        }
        sc.close();
    }
}
