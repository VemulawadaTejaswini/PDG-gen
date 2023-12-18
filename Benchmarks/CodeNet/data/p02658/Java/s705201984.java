import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        long[] a = new long[n];
        int che = 0;
        long zyu = 1;
        for(int i = 1 ; i <= 18 ; i++ ){
            zyu = zyu * 10;
        }
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextLong();
            s = s * a[i];
            if( s - zyu > 0 ){
                s = 0;
                che = 1;
            }
        }
        int chch = 0;
        for(int i = 0 ; i < n ; i++ ){
            if(a[i] == 0){
                chch = 1 ;
            }
        }
        if(che == 0){
            System.out.println(s);
        }else if(chch == 1){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
        sc.close();
    }
}