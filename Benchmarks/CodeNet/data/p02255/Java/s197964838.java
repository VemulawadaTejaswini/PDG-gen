import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(final String[] args) {

        new Main().sort();

    }

    void sort() {

        int N;
        int[] arr;

        //input
        final Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        for (int l=0; l<N; l++){
            if (l == N-1){
                System.out.println(arr[l]);
            }
            else{
                System.out.print(arr[l] + " ");
            }
        }

        // sort
        int key;

        for (int i=1; i<N; i++){
            key = arr[i]; 

            int j = i - 1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;                
            }
            arr[j+1] = key;

            for (int l=0; l<N; l++){
                if (l == N-1){
                    System.out.println(arr[l]);
                }
                else{
                    System.out.print(arr[l] + " ");
                }
            }
        }
    }
}
