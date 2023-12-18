import java.util.Scanner;

public class Main {

    static int SENTINEL = 2000000000;
    static int MAX = 500000;
    static int[] A = new int[MAX];
    static int[] L = new int[MAX/2 + 1];
    static int[] R = new int[MAX/2 + 1];
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            A[i] = sc.nextInt();
        }

        mergeSort(A,n,0,n);

        for(int i = 0 ; i < n; i ++){
            System.out.print(A[i]);
            if(i < n - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(cnt);
    }


    static void mergeSort(int[] A,int n,int left,int right){
        if(left + 1 < right){
            int mid = (left + right) / 2;
            mergeSort(A,n,left,mid);
            mergeSort(A,n,mid,right);
            merge(A,n,mid,left,right);
        }
    }

    static void merge(int[] A,int n,int mid,int left,int right){
        int n1 = mid - left;
        int n2 = right - mid;
        for(int i = 0;i < n1;i++){
            L[i] = A[left + i];
        }
        for(int i = 0;i < n2;i++){
            R[i] = A[mid + i];
        }

        L[n1] = R[n2] = SENTINEL;

        int i = 0 ,j = 0;
        for(int k = left; k < right; k ++){
            cnt ++;
            if(L[i] <= R[j]){
                A[k] = L[i ++];
            }else{
                A[k] = R[j ++];
            }
        }
    }

}

