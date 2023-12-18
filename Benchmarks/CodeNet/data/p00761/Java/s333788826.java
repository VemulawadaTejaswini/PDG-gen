import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/26.
 */
public class RecurringDecimals{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int[] a, accend, decend;
        int a_first, L, max, min, j, hoge;
        while((a_first = sc.nextInt()) != 0 | (L = sc.nextInt()) != 0){
            hoge = 0;
            j = 0;
            a = new int[21];
            a[0] = a_first;
            accend = new int[L];
            decend = new int[L];
            outer:
            while(true){
                max = 0;
                min = 0;
                if(j > 0) a_first = a[j];
                for(int i = 0; i < L; i++){
                    accend[i] = a_first%10;
                    a_first /= 10;
                }
                Arrays.sort(accend);
                for(int i = 0; i < L; i++) decend[i] = accend[L - (i + 1)];
                for(int i = 0; i < L; i++){
                    min += accend[i]*Math.pow(10, L - (i + 1));
                    max += decend[i]*Math.pow(10, L - (i + 1));
                }
                a[++j] = max - min;
                for(int i = 0; i < j; i++){
                    if(a[j] == a[i]){
                        hoge = i;
                        break outer;
                    }
                }
            }
            System.out.println(hoge + " " + a[j] + " " + (j - hoge));
        }
    }
}