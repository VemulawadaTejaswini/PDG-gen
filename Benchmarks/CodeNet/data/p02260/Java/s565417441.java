
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

    public static int selectionSort(int[] a,int n){
        int count = 0;
        for(int i = 0;i < n;i++){
            int minj = i;
            int j;
            for(j = i;j < n;j++){
                if(a[j] < a[minj]){
                    minj = j;
                }
            }
            int temp = a[i];
            a[i] = a[minj];
            a[minj] = temp;
            if(minj != i)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int count = selectionSort(a,n);
        trace(a, n);
        System.out.println(count);
    }
}
