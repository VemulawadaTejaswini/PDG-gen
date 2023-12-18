import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        print(a);
        insertion_sort(a);
        sc.close();
    }

    public static void print(int a[]) {
        for(int i = 0; i < a.length; ++i) {
            if(i != 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    public static void insertion_sort(int a[]) {
        for(int i = 1; i < a.length; ++i) {
            int v = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > v) {
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = v;
            print(a);
        }
    }
}
