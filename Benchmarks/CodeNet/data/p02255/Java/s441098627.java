import java.util.Scanner;

class Main{
    static void sortPrint(int[] a, int n){
        for(int i = 0; i < n - 1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);
    }

    static void insertionSort(int[] a, int n){
        for(int i = 1; i < n; i++){
            int v = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > v){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
            sortPrint(a,n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        sortPrint(a,n);
        insertionSort(a,n);
    }
}
