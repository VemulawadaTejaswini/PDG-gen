import java.util.Scanner;

/**
 * Created by akensho on 2015/11/23.
 */
public class Main {
    static int n, q;
    static int[] S, T;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while (read()){
            System.out.println(solve());
        }
    }

    static boolean read(){
        if( !sc.hasNext() ) return false;
        n = sc.nextInt();
        S = new int[n];
        for (int i = 0; i < S.length; i++){
            S[i] = sc.nextInt();
        }
        q = sc.nextInt();
        T = new int[q];
        for (int i = 0; i < T.length; i++){
            T[i] = sc.nextInt();
        }
        return true;
    }

    static int solve(){
        int res = 0;
        for (int key : T){
            if( binarySearch(S, key) ) res++;
        }
        return res;
    }
    /**
     * ??????targets???????´???¨?????????key????????¨????????????2?????¢?´¢??§??°??????????????????
     * @param targets := ??¢?´¢??????????±???¨????????????
     * @param key := ??¢?????????????´?
     * @return res
     */
    static boolean binarySearch(int[] targets, int key){
        int left = 0, right = targets.length;
        while ( left < right ){
            int middle = (left+right)/2;
            if( targets[middle] == key ) {
                return true;
            }
            if( targets[middle] < key ){
                left = middle+1;
            }else {
                right = middle;
            }
        }
        return false;
    }
}