import java.util.*;

public class Main{
    static int H;
    static int[] A;
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){
        H = sc.nextInt();
        A = new int[H+1];
        for(int i=1; i<=H; i++){
            A[i] = sc.nextInt();
        }
        buildMaxHeap();
        for(int i=1; i<=H; i++){
            sb.append(" " + A[i]);
        }
        System.out.println(sb.toString());
    }
    public static void maxHeapify(int i){
        int l = 2*i;
        int r = 2*i+1;
        int largest;
        int B;

        if(l <= H && A[l] > A[i]){
            largest = l;
        }else{
            largest = i;
        }
        if(r <= H && A[r] > A[largest]){
            largest = r;
        }
        if(largest != i){
            B = A[i] + A[largest];
            A[largest] = B - A[largest];
            A[i] = B - A[i];
            maxHeapify(largest);
        }
    }

    public static void buildMaxHeap(){
        for(int i=H/2; i>=1; i--){
            maxHeapify(i);
        }
    }
}
