import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwzheng on 2017/3/27.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(Reader.readLine());
        String A[] = Reader.readLine().split(" ",0);
        int[] arr = new int[N];
        for (int i=0; i < N; i++){
            arr[i] = Integer.parseInt(A[i]);
        }
        selectionSort(arr,N);
    }

    private static void selectionSort(int[] arr, int N){
        int count = 0;
        for (int i = 0; i < N; i++){
            int min = i;
            for (int j = i; j < N; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                exch(arr, min, i);
                count++;
            }
        }
        String str = "";
        for (int i = 0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        System.out.println(str.substring(0,str.length()-1));
        System.out.println(count);
    }

    private static void exch(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}