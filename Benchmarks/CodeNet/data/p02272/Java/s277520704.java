import java.util.*;
public class Main {
    static int counter = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] ls = new int[n];
        for(int x = 0; x < n; x++){
            ls[x] = scan.nextInt();
        }
        merge_sort(ls, 0, n);
        for(int x = 0; x < n; x++){
            if(x == n -1){
                System.out.println(ls[x]);
            }
            else{
                System.out.print(ls[x] + " ");
            }
        }
        System.out.println(counter);
    }
    public static void merge_sort (int[] lst, int left, int right){
        if(left + 1 < right){
            int mid = (left + right)/2;
            merge_sort(lst, left, mid);
            merge_sort(lst, mid, right);
            merge(lst, left, mid, right);
        }
    }
    public static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }
        int l = 0;
        int r = 0;
        for(int i = left; i < right; i++){
            counter++;
            if(l >= n1){
                A[i] = R[r];
                r++;
            }
            else if(r >= n2){
                A[i] = L[l];
                l++;
            }
            else if (L[l] <= R[r]){
                A[i] = L[l];
                l++;
            }
            else{
                A[i] = R[r];
                r++;
            }
        }
    }
}
