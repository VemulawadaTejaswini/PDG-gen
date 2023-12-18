import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main (String[] args) throws Exception {
        Scanner sch = new Scanner(System.in);
        int q = sch.nextInt();
           int[] A = new int[q];
        int f = 0;
        for (int c = f; c < q; c++) {
            A[c] = sch.nextInt();
           
        }
         int k = 0;
         k = pa(A,q-1);
       StringBuilder dd = new StringBuilder();
        for(int i = 0; i < q; i++) {
            if(i != 0){
                dd.append(" ");
            }
            if(i == k){
                dd.append('[');
                dd.append(A[i]);
                dd.append(']');
            }else{
                dd.append(A[i]);
            }
        }
        System.out.println(dd);
    }

    public static int pa(int[] A,int r) {
         
       int f = 0;
        int sort = 0;
        int x = A[r];
        int i = f - 1;
        for (int j = 0; j < r; ++j){
            if (A[j] <= x){
                ++i;
                sort = A[i];
                A[i] = A[j];
                A[j] = sort;
            }
        }
        sort = A[i + 1];
        A[i + 1] = A[r];
        A[r] = sort;
        return i + 1;
    }

}
