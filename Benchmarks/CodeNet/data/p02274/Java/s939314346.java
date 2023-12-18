import java.util.Scanner;

public class Main {
    
    static long count;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        count = 0;
        
        mergeSort(a, 0, n);
        
        System.out.println(count);
    }
    
    static void merge(int[] a, int left, int mid, int right){
        
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1 +1];
        int[] r = new int[n2 +1];
        for(int i = 0; i < n1; i++){
            l[i] = a[left +i];
        }
        for(int i = 0; i < n2; i++){
            r[i] = a[mid +i];
        }
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for(int k = left; k < right; k++){
            if(l[i] <= r[j]){
                a[k] = l[i];
                i++;
            }else{
                a[k] = r[j];
                j++;
                count += n1 -i;
            }
        }
    }
    
    static void mergeSort(int[] a, int left, int right){
        
        if(left+1 < right){
            int mid = (left + right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }
}
