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
            System.out.println(linerSearch(S, T));
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

    static int linerSearch(int[] target, int[] values){
        int res = 0;
        for (int key : values)
            for(int elements : target)
                if (elements == key) res++;
        return res;
    }
}