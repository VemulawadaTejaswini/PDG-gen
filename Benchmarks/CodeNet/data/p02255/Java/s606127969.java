import java.util.Scanner;

/**
 * Created by hwzheng on 2017/3/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] line = scanner.nextLine().split(" ");

        int[] arr = new int[N];
        for (int i=0; i < N; i++){
            arr[i] = Integer.parseInt(line[i]);
        }
        insertionSort(arr,N);
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++){
            int v = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > v){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = v;
        }
        String s = "";
        for (int k : arr){
            s += s + k + " ";
        }
        System.out.println(s.trim());
    }
}