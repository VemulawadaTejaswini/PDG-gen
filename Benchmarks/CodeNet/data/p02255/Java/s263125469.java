/**
 * Created by akensho on 2015/11/22.
 */
import java.util.*;
class Main {
    static int n;
    static int[] a;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        while( read() ){
            insertionSort(a);
        }
    }

    static boolean read(){
        if( !scanner.hasNext() ) return false;
        n = scanner.nextInt();
        a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        return true;
    }

    /**
     * ?????\??????????????????????????????
     * @param array := 0-indexed ??§ N ??????????´????????????????
     * return ????????????????????????
     */
    static int[] insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            while ( j >= 0 && array[j] > v ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = v;
            traceArray(array);
        }
        return array;
    }

    static void traceArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if (i == array.length - 1) {
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}