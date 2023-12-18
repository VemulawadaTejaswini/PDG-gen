import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] t = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(t[i]);
        }

        trace(a, n);
        insertionSort(a, n);
    }

    public static void trace(int[] a, int n){
        int i;
        for(i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int[] a, int n){
        int j, i, v;
        for(i = 1; i < n; i++){
            v = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            trace(a, n);
        }
    }

}