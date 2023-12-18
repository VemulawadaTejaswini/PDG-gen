import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] A = new int[n];
        for(int i=0; i < n; ++i) {
            A[i] = scan.nextInt();
        }

        MergeSort m = new MergeSort(A);

        for(int i=0; i < A.length; ++i) {
            if(i != 0) {
                System.out.print(" ");
            }
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println(m.getComp());
        scan.close();
    }
}

class MergeSort {
    private int[] A;
    private int comp = 0;

    public MergeSort(int[] A) {
        this.A = A;
        mergesort(0, A.length);
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for(int i=0; i < n1; ++i) {
            L[i] = A[left+i];
        }

        for(int i=0; i<n2; ++i) {
            R[i] = A[mid+i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for(int k=left; k < right; ++k) {
            comp += 1;
            if(L[i] <= R[j]) {
                A[k] = L[i];
                i += 1;
            } else {
                A[k] = R[j];
                j += 1;
            }
        }
    }
    public void mergesort(int left, int right) {
        if(left+1 < right) {
            int mid = (left + right) / 2;
            mergesort(left, mid);
            mergesort(mid, right);
            merge(left, mid, right);
        }
    }

    public int getComp() {return comp;}
}
