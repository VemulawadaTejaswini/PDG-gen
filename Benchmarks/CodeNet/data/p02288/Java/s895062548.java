
import java.util.*;

/**
 * B
 */
public class Main {

    public void run() {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int[] A = new int[H+1];

        for(int i=1; i<=H; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=H/2; i>=1; i--) {
            maxHeapify(A, i);
        }

        for(int i=1; i<=H; i++) {

            if (i == H) {
                System.out.println(A[i]);
                break;
            }
            System.out.print(A[i]+" ");

        }


    }

    protected void maxHeapify(int[] A, int i) {

        int H = A.length-1;

        int l = left(i);
        int r = right(i);

        int largest;

        if(l<=H && A[l]>A[i]) {
            largest = l;
        } else {
            largest = i;
        }

        if(r<=H && A[r]>A[largest]) {
            largest = r;
        }

        if(largest != i) {

            int tmp = A[i];

            A[i] = A[largest];
            A[largest] = tmp;

            maxHeapify(A, largest);

        }
        
    }

    protected int left(int i) {

        int res = i*2;

        return res;
    }

    protected int right(int i) {

        int res = i*2+1;

        return res;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
