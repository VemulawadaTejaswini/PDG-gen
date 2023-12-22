import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by hwzheng on 2017/3/26.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
        int j=0;
        int N = Integer.parseInt(Reader.readLine());
        String A[] = Reader.readLine().split(" ",0);
        int[] arr = new int[N];
        for (int i=0; i < N; i++){
            arr[i] = Integer.parseInt(A[i]);
        }
        insertionSort(arr,N);
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++){
            int v = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > v){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = v;
            String s = "";
            for (int anArr : arr) {
                s = s + anArr + " ";
            }
            System.out.println(s.trim());
        }
    }
}