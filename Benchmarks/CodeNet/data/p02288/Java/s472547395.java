import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] T = new int[n + 1];

        for(int i = 1 ; i <= n ; i ++){
            T[i] = sc.nextInt();
        }

        bulidMaxHeap(T);

        for(int i = 1; i <= n; i++){

            System.out.print(" " + T[i]);


        }

    }

    static void bulidMaxHeap(int[] T){
        for(int i = n/2; i >= 1; i --){
            maxHeapify(T,i);
        }
    }

    static void maxHeapify(int[] T,int i){
        int largest = 0;
        int l = left(i);
        int r = right(i);

        if(l <= n && T[l] > T[i]){
            largest = l;
        }else{
            largest = i;
        }

        if(r <= n &&  T[r] > T[largest]){
            largest = r;
        }

        if(largest != i){
            int v = T[i];
            T[i] = T[largest];
            T[largest] = v;

            maxHeapify(T,largest);
        }
    }


    static int left(int i ){
        return 2*i;
    }

    static int right(int i){
        return 2 * i + 1;
    }
}

