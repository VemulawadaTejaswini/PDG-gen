import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] a = new int[N];

        for ( int i = 0; i < N; i++ ){
            a[i] = sc.nextInt();
        }
        sortTheCards(N, a);
        System.out.println(dealTheCards(N, a));
    }
    private static void sortTheCards(int N, int[] a){
        Arrays.sort(a);
        
        for(int i=0;i<a.length / 2; ++i) {
            int temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
        }
    }
    private static int dealTheCards(int N, int[] a){
        int sub = 0;
        int Alice = 0;
        int Bob = 0;
        for( int i = 0; i < N; i++){
            if( i % 2 == 0 ){
                Alice += a[i];
            }else{
                Bob += a[i];                
            }
        }
        sub = Alice - Bob;
        return sub;
    }
}
