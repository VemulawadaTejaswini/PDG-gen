
import java.util.Scanner;

public class Main {
    public static void trace(int[] a,int n){
        for (int i = 0;i < n;i++){
            if(i > 0)
                System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
    public static void insertionSort(int[] a,int n){
        for(int i = 1;i < n;i++){
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            trace(a,n);
        }
    }

    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0;i < n;i++)
            a[i] = sc.nextInt();
        trace(a,n);
        insertionSort(a,n);
    }
}
