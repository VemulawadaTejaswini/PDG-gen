import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static int MAX = 500000;
    public static int SENTINEL = 2000000000;
    public static int[] L = new int[MAX / 2 + 2];
    public static int[] R = new int[MAX / 2 + 2];
    public static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[MAX];
        cnt = 0;
        String[] in = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(in[i]);
        }

        mergeSort(A, n, 0, n);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0) sb.append(" ");
            sb.append(A[i]);
        }
        sb.append("\n").append(cnt);
        System.out.println(sb);
    }

    public static void mergeSort(int[] A, int n, int left, int right){
        if(left + 1 < right){
            int mid = (left + right) / 2;
            mergeSort(A, n, left, mid);
            mergeSort(A, n, mid, right);
            merge(A, n, left, mid, right);
        }
    }
    public static void mergeSort(int[] A, int n, int left, int right){
        if(left + 1 < right){
            int mid = (left + right) / 2;
            mergeSort(A, n, left, mid);
            mergeSort(A, n, mid, right);
            merge(A, n, left, mid, right);
        }
    }

    public static void merge(int[] A, int n, int left, int mid, int right){
        int n1 = mid - left;
        int n2 = right - mid;
        //System.out.println("yes");                                                  
        for(int i = 0; i < n1; i++) L[i] = A[left + i];
        for(int i = 0; i < n2; i++) R[i] = A[mid + i];
        L[n1] = R[n2] = SENTINEL;
        int i = 0, j = 0;
        for(int k = left; k < right; k++){
            cnt++;
            if(L[i] <= R[j]){
                A[k] = L[i++];
            }else{
                A[k] = R[j++];
            }
        }
    }

}