import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        countingSort(list, result, n);
        for(int i=0;i<n;i++){
            System.out.print(result[i]);
            if(i!=n-1){
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    static void countingSort(int[] a, int[] b, int n) {
        int k = 10001;
        int[] c = new int[k];
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int i = 0; i < n; i++) {
            c[a[i]]--;
            b[c[a[i]]] = a[i];
        }

    }
}