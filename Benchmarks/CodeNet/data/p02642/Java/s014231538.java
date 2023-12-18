import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main {    
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sn = input.readLine();
        int n = Integer.parseInt(sn);
        String[] as = input.readLine().split(" ");
        int[] ai = Stream.of(as).mapToInt(Integer::parseInt).toArray();
        int[] array = quickSort(ai);
        int ans = 0;
        for(int i=0;i<n;i++){
//            System.out.print(array[i] + " ");

        }
        for(int i=n-1;i>0;i--){
            boolean flag = true;
            for(int j=0;j<i;j++){
//                System.out.println(array[i] + " " + array[j] + " " + i + " " + j);
                if(array[i] % array[j] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans++;
//                System.out.println(ans);
            }
        }
        if(!(array[1]==array[0])){
            ans++;
        }
        System.out.println(ans);
    }
    
    public static int[] quickSort(int[] a) {
        int[] b = quickSort(a, 0, a.length-1);
        return b;
        
    }

    private static int[] quickSort(int[] a, int left, int right) {
        for (int k = left; k <= right; k++) {
        }

        int pivot = a[left];
        int i = left;
        int j = right;
        while (true) {
            while (a[i] < pivot) {
                i++;
            }
            while (pivot < a[j]) {
                j--;
            }
            if (i >= j) {
                break;
            }
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        for (int k = left; k <= right; k++) {
            if (k == i - 1) {
            }
        }
        if (left < i - 1) {
            quickSort(a, left, i - 1);
        }
        if (j + 1 < right) {
            quickSort(a, j + 1, right);
        }
        return a;
    }
}