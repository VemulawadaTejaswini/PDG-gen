import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        //空読み
        sc.nextLine();

        String[] input = sc.nextLine().split(" ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        insertionSort(array, n);
    }

    private static void insertionSort(int a[], int n) {
        
        StringBuilder sb = new StringBuilder();
        for(int value: a) {
            sb.append(value + " ");
        }
        System.out.println(sb.toString().trim());
        sb.setLength(0);
        for(int i = 1; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            while( (j >= 0) && (a[j] > v) ) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;

            sb = new StringBuilder();
            for(int value: a) {
                sb.append(value + " ");
            }
            System.out.println(sb.toString().trim());
            sb.setLength(0);
        }
    }
    
}
