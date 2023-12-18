import java.util.*;

class Main{
    public static void main(String[] a){

        int[] h = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};//10??¶????????±??????????????????
        Arrays.sort(h);

        for(int i = 9; i >= 7; i--){
            System.out.println(h[i]);
        }

    }
}